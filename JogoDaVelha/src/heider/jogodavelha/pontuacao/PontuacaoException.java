package heider.jogodavelha.pontuacao;

import heider.jogodavelha.JogoDaVelhaException;

/**
 * Exceção relacionada à problemas na pontuação
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
