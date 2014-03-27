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
	ListaOrdenada<String> lista2 = new ListaOrdenada<String>();
	String url = "C:/Users/bruno/Desktop\\Agenda.txt";
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
	public void recuperar() throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("C:/Users/bruno/Desktop\\Agenda.txt"));
		String str;
		try {
		while (in.ready()) {
			
		str = in.readLine();
		//process(str);
		String f = str;
		String [] s = f.split("     ");
		//System.out.println(s[0] + s[1]);
		Contato c = new Contato(s[0] , s[1]);
		lista2.insert(new Nodo(c), lista2.getHead());
		}
		in.close();
		lista2.print();
} catch (IOException e) {

}

}	


}