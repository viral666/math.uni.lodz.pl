package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

import com.gft.structuraltest.testconference.shared.Answer;

public class AnswerEntityTest{
	
    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
    }
    
    
    @Test
    public void shouldReturnTrueWhenComparingObjectWithItself(){
        AnswerEntity an1 = new AnswerEntity();
        assertTrue(an1.equals(an1));
    }
    
    @Test
    public void shouldReturnFalseWhenObjectIsNull1(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
    }
    
    @Test
    public void shouldReturnFalseWhenComparingToOtherObjectClass(){
    	Answer answer = new Answer();
    	AnswerEntity an = new AnswerEntity();
    	assertFalse(an.equals(answer));
    }
    
    @Test
    public void shouldReturnFalseWhenFirstObjectAnswerIsNullAndSecondObjectAnswerIsNotNull(){
    	AnswerEntity an1 = new AnswerEntity();
    	AnswerEntity an2 = new AnswerEntity();
    	an2.setAnswerText("lol");
    	assertFalse(an1.equals(an2));
    }


    @Test
    public void shouldReturnTrueWhenAnswerTextFromFirstObjIsNotEqualToAnswerTextInSecondObj(){
     	AnswerEntity an1 = new AnswerEntity();
    	AnswerEntity an2 = new AnswerEntity();
    	an1.setAnswerText("lol");
    	an2.setAnswerText("lol2");
    	assertFalse(an1.equals(an2));
    }
    
    @Test
    public void shouldReturnFalseWhenFirstObjectIdIsNullAndSecondObjectIdIsNotNull(){
    	AnswerEntity an1 = new AnswerEntity();
    	AnswerEntity an2 = new AnswerEntity();
    	an2.setId(1L);
    	assertFalse(an1.equals(an2));
    }
    
    @Test
    public void shouldReturnFalseWhenQuestionIsNotNull(){
    	QuestionEntity q1 = new QuestionEntity();
    	QuestionEntity q2 = new QuestionEntity();
    	q2.setQuestionText("lol");
    	assertFalse(q1.equals(q2));
    }

    @Test
    public void shouldReturnTrueAtTheEndOfMethod(){
    	AnswerEntity an1 = new AnswerEntity();
    	AnswerEntity an2 = new AnswerEntity();
    	an1.setAnswerText("lol");
    	an2.setAnswerText("lol");
    	an1.setId(1L);
    	an2.setId(1L);
    	QuestionEntity question = new QuestionEntity();
    	an1.setQuestion(question);
    	an2.setQuestion(question);
    	assertTrue(an1.equals(an2));
    }

    
}