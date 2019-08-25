package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResultIsDead() {
        Person person = new Person("pepitoelmuertito",99,99,Gender.MALE,false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void validateRegistryResultNotIsDead() {
        Person person = new Person("pepitoelmuertito",99,99,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertNotEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void validateRegistryResultInvalidAge() {
    	Person person= new Person("pepitonegativo",98,-1,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
  
    @Test
    public void validateRegistryResultNotInvalidAge2() {
    	Person person= new Person("pepitonegativo",98,0,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(person);
        Assert.assertNotEquals(RegisterResult.INVALID_AGE, result);
    }   
    
    @Test
    public void validateRegistryResultNotInvalidAge3() {
    	Person person= new Person("pepitonegativo",98,1,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(person);
        Assert.assertNotEquals(RegisterResult.INVALID_AGE, result);
    } 
    
    @Test
    public void validateRegistryResultInvalidAge2() {
    	Person person= new Person("matusalen",97,125,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void validateRegistryResultNotInvalidAge4() {
    	Person person= new Person("matusalen",97,124,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(person);
        Assert.assertNotEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void validateRegistryResultNotInvalidAge5() {
    	Person person= new Person("matusalen",97,123,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(person);
        Assert.assertNotEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void validateRegistryResultUnderAge() {
    	Person person= new Person("luisito",96,17,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void validateRegistryResultNotUnderAge() {
    	Person person= new Person("luisito",96,18,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(person);
        Assert.assertNotEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void validateRegistryResultNotUnderAge2() {
    	Person person= new Person("luisito",96,19,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(person);
        Assert.assertNotEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void validateRegistryResultDuplicate() {
    	Person person= new Person("juano",95,19,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
        RegisterResult result2 = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, result2);
    }
    
    @Test
    public void validateRegistryResultNotDuplicate() {
    	Person person= new Person("juano",95,19,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
        Assert.assertNotEquals(RegisterResult.DUPLICATED, result);
    }
    
    
    @Test
    public void validateRegistryResultValid() {
    	Person person= new Person("luisa",93,18,Gender.FEMALE,true);
    	RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void validateRegistryResultValid2() {
    	Person person= new Person("luisa",93,19,Gender.FEMALE,true);
    	RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    // TODO Complete with more test cases
}