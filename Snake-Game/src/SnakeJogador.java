import java.awt.Point;
import java.util.*;

/**
 * Classe de exemplo para a implementação de um Jogador para o Jogo Snake.
 * Nesta implementação, a próxima direção da cobra é escolhida aleatoriamente
 * entre as direções possíveis (que não geram colisões).
 * <p>
 * Use esta classe como base inicial para a sua solução do jogo. Basicamente
 * você precisará reimplementar o método {@code getDirecao}.
 * 
 * @author Horácio
 */

public class SnakeJogador {
    private Snake jogo;
    
    /**
     * Cria um novo jogador para o jogo passado como parâmetro.
     * @param jogo jogo snake.
     */
    public SnakeJogador(Snake jogo) {
        this.jogo = jogo;
    }

    /**
     * Executado pelo método {@link Snake#inicia()} a cada 'tick' do jogo para
     * perguntar qual a próxima direção da cobra ('C'ima, 'D'ireita, 'B'aixo,
     * 'E'squerda ou 'N'enhum).
     * 
     * @return a próxima direção da cobra.
     */
    public char getDirecao() {
    	Point jogo = 
    	Point comida = jogo.getComida();
        int posy, posx;
        
        // Para saber a distancia entre a cabeca e a comida em rela��o (x,y)
        posx = comida.x - cabeca.x;
        posy = comida.y - cabeca.y;      
      
 		if(posy > 0)
        {  
        	if(jogo.isCelulaLivre(cabeca.x, cabeca.y+1)) return 'B'; 
        	if(jogo.isCelulaLivre(cabeca.x-1, cabeca.y)) return 'E';    
        	if(jogo.isCelulaLivre(cabeca.x+1, cabeca.y)) return 'D';      	
        	if(jogo.isCelulaLivre(cabeca.x, cabeca.y-1)) return 'C'; 
        }
        else if(posy < 0)
        {
        	if(jogo.isCelulaLivre(cabeca.x, cabeca.y-1)) return 'C';   
        	if(jogo.isCelulaLivre(cabeca.x-1, cabeca.y)) return 'E';       	
        	if(jogo.isCelulaLivre(cabeca.x+1, cabeca.y)) return 'D'; 
        	if(jogo.isCelulaLivre(cabeca.x, cabeca.y+1)) return 'B';        	
        }
        else if(posx > 0 && posy == 0)
        {
        	if(jogo.isCelulaLivre(cabeca.x+1, cabeca.y)) return 'D';  
        	if(jogo.isCelulaLivre(cabeca.x, cabeca.y+1)) return 'B';  
        	if(jogo.isCelulaLivre(cabeca.x, cabeca.y-1)) return 'C';  
        	if(jogo.isCelulaLivre(cabeca.x-1, cabeca.y)) return 'E'; 
        }
        else if(posx < 0 && posy == 0)
        {
        	if(jogo.isCelulaLivre(cabeca.x-1, cabeca.y)) return 'E';
        	if(jogo.isCelulaLivre(cabeca.x, cabeca.y+1)) return 'B'; 
        	if(jogo.isCelulaLivre(cabeca.x, cabeca.y-1)) return 'C';      	
        	if(jogo.isCelulaLivre(cabeca.x+1, cabeca.y)) return 'D';        	 
        }   
        
        
        return 'N';
}}

 