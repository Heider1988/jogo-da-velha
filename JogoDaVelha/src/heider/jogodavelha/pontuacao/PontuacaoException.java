package heider.jogodavelha.pontuacao;

import heider.jogodavelha.JogoDaVelhaException;

/**
 * Exce��o relacionada � problemas na pontua��o
 */
public class PontuacaoException extends JogoDaVelhaException {

	/**
	 * @see JogoDaVelhaException#JogoDaVelhaException(String)
	 * @param message
	 */
	public PontuacaoException(String message) {
		super(message);
	}
}
