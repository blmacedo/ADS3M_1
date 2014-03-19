package com.senac.estruturas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class LerEscrever {
	
	String url = "C:/Users/Christian/Desktop\\Agenda.txt";
	Path path = Paths.get(url);

	public Object salvar(Contato obj) throws IOException {
		String newLine = System.getProperty("line.separator");  
		
		if (!Files.exists(path)) {
			Files.createDirectories(path.getParent());
		}

		File file = new File(url);

		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		//out.println(obj.getNome() + obj.getTelefone());
		bw.write(  obj.getNome() + "     " + obj.getTelefone()+newLine);
		bw.flush();
		bw.close();
		bw.close();

		return file;
	}


}