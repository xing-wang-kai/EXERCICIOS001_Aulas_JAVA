package br.com.bytebank.banco.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EscreverArquivos {
	
	public static void main(String[] args) {
		System.out.println("ESCREVA O ARQUIVO: ---");
		System.out.println("APERTE 2x ENTER PARA TERMINAR!");
		try {
			InputStream fis = System.in;
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			FileOutputStream fos = new FileOutputStream("teclado.md");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			String line = br.readLine();
			
			while(line != null && !line.isEmpty()) {
				bw.write(line);
				bw.newLine();
				line = br.readLine();
			}
			
			bw.close();
			br.close();
		}catch(Exception err) {
			System.out.println("ERR: " + err.getMessage());
		}
		
	}

}
