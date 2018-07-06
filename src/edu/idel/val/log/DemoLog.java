package edu.idel.val.log;

import org.apache.log4j.Logger;

public class DemoLog {
	
	private final static Logger log = Logger.getLogger("mylog");
	
	public static void main(String[] args) {
		
		log.info("PASA POR AQUÍ");
		
	}

}
