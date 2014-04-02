package Model;

public class Mapa {	
	public void inicializaTabuleiro(int[][] tabuleiro) {
		
		for (int linha = 0; linha < 10; linha++)
			
			for (int coluna = 0; coluna < 10; coluna++)
				
				tabuleiro[linha][coluna] = -1;
	}

	public void mostraTabuleiro(int[][] tabuleiro) {	
		
		System.out.println("\tA \tB \tC \tD \tE \tF \tG \tH \tI \tJ");
		
		System.out.println();

		for (int linha = 0; linha < 10; linha++) {
			
			System.out.print((linha + 1) + "");
			
			for (int coluna = 0; coluna < 10; coluna++) {
				
				if (tabuleiro[linha][coluna] == -1) {
					
					System.out.print("\t" + ".");
					
				} else if (tabuleiro[linha][coluna] == 0) {
					
					System.out.print("\t" + "0");
					
				} else if (tabuleiro[linha][coluna] == 1) {
					
					System.out.print("\t" + "-");
				}

			}
			System.out.println();
		}

	}
}


