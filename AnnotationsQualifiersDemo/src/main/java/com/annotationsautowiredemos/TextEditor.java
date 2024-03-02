package com.annotationsautowiredemos;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

//	@Autowired
	SpellChecker sp;
	
	@Autowired
	public TextEditor(SpellChecker sp)
	{
		this.sp=sp;
	}
	
//	@Autowired
//	public void setSp(SpellChecker sp)
//	{
//		this.sp=sp;
//		
//	}
	
//	public SpellChecker getSp()
//	{
//		return sp;
//	}
	
	public void checkText()
	{
		sp.checkSpell();
	}


}
