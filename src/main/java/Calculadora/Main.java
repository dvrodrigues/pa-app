package calculadora;

import java.util.logging.Logger;

public class Main {
	
		private static final Logger logger = Logger.getLogger( Main.class.getName() );
	    public static void main( String[] args )
	    {
	    	Main main = new Main();
			logger.info("Soma 1+2="+ main.soma(1,2));
			logger.info("Subtração 4-2="+ main.sub(4,2));
			logger.info("Multiplicação 1*2="+ main.multi(1,2));
			logger.info("Divisão 4/2="+ main.div(4,2));
	    }
		
		public int soma(int s1, int s2) {
			return s1+s2;
		}
		public int sub(int s1, int s2) {
			return s1-s2;
		}
		public int multi(int s1, int s2) {
			return s1*s2;
		}
		public int div(int s1, int s2) {
			return s1/s2;
		}
}
