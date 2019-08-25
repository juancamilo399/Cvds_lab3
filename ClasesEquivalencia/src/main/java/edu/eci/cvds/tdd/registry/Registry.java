package edu.eci.cvds.tdd.registry;
import java.util.HashSet;
import java.util.Set;

public class Registry{
	Set<Integer> inscritos= new HashSet<Integer>();
	
	public RegisterResult registerVoter(Person p) {
		RegisterResult result=null;
		if(!p.isAlive())result=RegisterResult.DEAD;
		else if(p.getAge()<0|| p.getAge()>124)result=RegisterResult.INVALID_AGE;
		else if(p.getAge()<18)result=RegisterResult.UNDERAGE;
		else if(inscritos.contains(p.getId())) result=RegisterResult.DUPLICATED;
		else {
			result=RegisterResult.VALID;
			inscritos.add(p.getId());
		}

    return result;
	}
} 