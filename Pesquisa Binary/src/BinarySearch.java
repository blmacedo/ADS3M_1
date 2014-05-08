import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	String nome[] = new String[20];
	Scanner entrada = new Scanner(System.in);
	
	public void loadFile(String filename) {		
		
		try {
			Scanner arq = new Scanner(new FileReader(filename));
			while (arq.hasNext()) {
				String name = null;
				for (int i = 0; i < nome.length; i++) {
					nome[i] = arq.nextLine().toUpperCase();
					
				}
			}
			
		} catch (FileNotFoundException e) {		
		}
	}

	public void ordena() {
		Arrays.sort(nome);
		System.out.println("\n    \'Nomes em Ordem Crescente\' \n");

		for (int i = 0; i < nome.length; i++) {
			System.out.println("Pos  >>  " + i + "  >>  " + nome[i]);
		}

	}
	
	public void Pesquisar() throws IOException {    
        int comeco, meio = 0, fim;     
        boolean acha = false;     
        String pesquisa = "", desejo = "";     
        char continua = 'S'; 
        
        do{     
            System.out.println("\nEntre com o nome a ser pesquisado !");     
            pesquisa = entrada.next().toUpperCase();     
                 
            comeco = 0;      
            fim = nome.length - 1;      
            acha = false;     

            while((comeco <= fim) && (acha == false)){     
                meio = ((comeco + fim)/2);     
                if(nome[0].toUpperCase().equalsIgnoreCase(pesquisa)){     
                    acha = true;   
                    meio = 0;  
                    break;     
                }    
                if(nome[meio].toUpperCase().equalsIgnoreCase(pesquisa)){     
                    acha = true;     
                    break;     
                }     
                else{     
                    if(nome[meio].toUpperCase().startsWith(pesquisa))     
                        fim = meio - 1;     
                    else       
                        comeco = meio + 1;     
                }                   
            }     
            /* Método que imprime o Resultado */     
            if(acha){     
                System.out.println("O nome \"" + pesquisa + "\" foi localizado na posição \'" + meio + "\'");     
            }else{     
                System.out.println("O nome \"" + pesquisa + "\" não foi localizado !");     
            }     
            System.out.println("Deseja continuar, S/N ? ");     
            desejo = entrada.next().toUpperCase();     
            continua = desejo.charAt(0);                   
        }while(continua != 'N');       
        System.in.read();     
    }    
	

	
	public static void main(String[] args) throws Exception {
		(new BinarySearch()).run(args);
	}
	public void run(String[] args) throws Exception {
		loadFile("telefones.dat");
		ordena();
		Pesquisar();

	}

}  
