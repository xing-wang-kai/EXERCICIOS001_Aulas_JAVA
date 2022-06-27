package br.com.bytebank.banco.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LerArquivos {
	
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("arquivo.txt");
			InputStreamReader readed = new InputStreamReader(file);
			BufferedReader buffer = new BufferedReader(readed);
			
			String line = buffer.readLine();
			
			int numline = 0;
			while(line != null) {
				
				System.out.println("LINE: " + numline);
				System.out.println(line);
				line = buffer.readLine();
				numline ++;
			}
			
			buffer.close();
			
		}catch(Exception err) {
			System.out.println("ERROR: " + err.getMessage());
		}
		
		try {
			FileOutputStream file = new FileOutputStream("arquivo2.txt");
			OutputStreamWriter reader = new OutputStreamWriter(file);
			BufferedWriter buffer = new BufferedWriter(reader);
			
			buffer.write("Esta é uma linha escrita!!");
			buffer.newLine();
			buffer.write("Esta é uma nova linha escrita!!");
			buffer.newLine();
			buffer.write("mais uma linha escrita");
			buffer.close();
			
		}catch(Exception err) {
			System.out.println("error: " + err.getMessage());
		}
	}

}
