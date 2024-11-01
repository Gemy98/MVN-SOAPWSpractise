package com.gemy.jee.soap;



import jakarta.ejb.Stateless;
import jakarta.jws.WebService;

@Stateless
@WebService
public class ScoreService {
	
	public static Score score = new Score();
	
	@jakarta.jws.WebMethod(operationName = "getTheScore")
	public Score getScore() {
		
		return score ; 
	}
	
	
	
	public Score updateScore(int w , int l , int t) {

		score.wins = w ; 
		score.losses  = l ; 
		score.ties = t ; 
		return score ; 
	}
	 

}
