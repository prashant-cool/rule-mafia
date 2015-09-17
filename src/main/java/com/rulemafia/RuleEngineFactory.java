package com.rulemafia;

/**
 * @author Prashant Gupta, Karthick Venkatesan, Rajesh Kozhamannan Satyanarayana, Parimala C, Vidhula Baburaj
 *
 */
public class RuleEngineFactory {
	public <T> RuleEngine<T> getRuleEngine(String csvFileName, Class<T> outputType) {
		return new RuleEngine<T>();
	}
}
