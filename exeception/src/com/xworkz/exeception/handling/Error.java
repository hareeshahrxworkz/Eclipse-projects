package com.xworkz.exeception.handling;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.event.AWTEventListenerProxy;
import java.io.IOError;
import java.lang.annotation.AnnotationFormatError;
import java.nio.charset.CoderMalfunctionError;
import java.util.ServiceConfigurationError;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.validation.SchemaFactoryConfigurationError;

public class Error {

	public void Anotation1() {
		System.out.println("Error");
		throw new AnnotationFormatError("");
	}

	public void Assert() {
		System.out.println("Error");
		throw new AssertionError("");
	}

	public void AWT() {
		System.out.println("Error");
		throw new AWTError("");
	}

	public void Awterror() throws AWTException {
		System.out.println("Error");
		throw new AWTException("");
	}

	public void Coder() {
		System.out.println("Error");
		throw new  CoderMalfunctionError(null);
	}

	public void Factory() {
		System.out.println("Error");
		throw new FactoryConfigurationError();
	}

	public void Configure() {
		System.out.println("Error");
		throw new FactoryConfigurationError("");
	}

	public void Fact() {
		System.out.println("Error");
		throw new FactoryConfigurationError("");
	}

	public void Regf() {
		System.out.println("Error");
		throw new FactoryConfigurationError("");
	}

	public void IO() {
		System.out.println("Error");
		throw new IOError(null);
	}

	public void LINK() {
		System.out.println("Error");
		throw new LinkageError();
	}

	public void Schema() {
		System.out.println("Error");
		throw new SchemaFactoryConfigurationError("");
	}

	public void Achemafactory() {
		System.out.println("Error");
		throw new SchemaFactoryConfigurationError("");
	}

	public void Service() {
		System.out.println("Error");
		throw new  ServiceConfigurationError(null);
	}

	public void Thread() {
		System.out.println("Error");
		throw new ThreadDeath();
	}

	public void Code() {
		System.out.println("Error");
		throw new CoderMalfunctionError(null);
	}

	public void THRE() {
		System.out.println("Error");
	throw new TransformerFactoryConfigurationError("");
	}

	public void Virtual() {
		System.out.println("Error");
		throw new VirtualMachineError() {
		};
		
	}

	

}
