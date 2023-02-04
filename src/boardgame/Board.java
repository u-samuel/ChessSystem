package boardgame;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private int rows;
	private int columns;
	
	List<Piece> pieces = new ArrayList<>();
	
	public Board() {
		
	}

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}
	
	public List<Piece> getPieces() {
		return pieces;
	}
	
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int column) {
		
	}
	
	public Piece piece(Position position) {
		
	}
	
	public void placePiece(Piece piece, Position position) {
		
	}
	
	public void removePiece(Piece piece, Position position) {
		
	}	
	
	public boolean positionExists(Position position) {
		
	}
	
	public boolean thereIsAPiece(Position position) {
		
	}

}
