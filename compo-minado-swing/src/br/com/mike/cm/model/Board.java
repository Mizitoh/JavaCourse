package br.com.mike.cm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Board {
	
	private int lines;
	private int columns;
	private int mines;
	
	private final List<Field> fields = new ArrayList<>();

	public Board(int lines, int columns, int mines) {
		super();
		this.lines = lines;
		this.columns = columns;
		this.mines = mines;
		
		generateFields();	
		associateNeighbors();
		mixTheMines();
	}
	
	public void open(int line, int column) {
		try {
			fields.parallelStream()
			.filter(f -> f.getLine() == line && f.getColumn() == column)
			.findFirst().ifPresent(f -> f.open());;
		} catch (Exception e) {
			//FIXME Ajustar a implementação do metodo abrir
			fields.forEach(f -> f.setOpen(true));
			throw e;
		}
	}
	
	public void mark(int line, int column) {
		fields.parallelStream()
		.filter(f -> f.getLine() == line && f.getColumn() == column)
		.findFirst().ifPresent(f -> f.changeMark());;
	}

	private void generateFields() {
		for (int l = 1; l < lines; l++) {
			for(int c = 1; c <columns; c++) {
				fields.add(new Field (l, c));
			}
		}
		
	}

	private void associateNeighbors() {
		
		for (Field field1: fields) {
			for(Field field2: fields) {
				field1.addNeighbor(field2);
			}
		}
	}

	private void mixTheMines() {
		long minesPrepeared = 0;
		Predicate<Field> mined = m -> m.isItMined();
		do {
			int sorted = ( int ) (Math.random() * fields.size());
			fields.get(sorted).hasMine();
			minesPrepeared = fields.stream().filter(mined).count();
		} while(minesPrepeared < mines);
	}
	
	public boolean objectiveSuccess() {
		return fields.stream().allMatch(f -> f.objectiveSuccess());
	}
	
	public void reestarter() {
		fields.stream().forEach(f -> f.reestart());
		mixTheMines();
	}
	
}
