package com.xworkz.exeception.handling;

import java.awt.color.CMMException;
import java.awt.image.ImagingOpException;
import java.io.UncheckedIOException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.invoke.WrongMethodTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.charset.MalformedInputException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.time.DateTimeException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.RejectedExecutionException;

import javax.lang.model.element.UnknownAnnotationValueException;
import javax.lang.model.type.MirroredTypeException;
import javax.lang.model.type.MirroredTypesException;
import javax.management.JMRuntimeException;
import javax.management.RuntimeErrorException;
import javax.naming.CannotProceedException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.bind.DataBindingException;
import javax.xml.bind.TypeConstraintException;

import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;

public class RuntimeExe {
	public void RuntimeExeption() {
		System.out.println("Before exeption creation runtime");
		throw new RuntimeException();

	}

	public void Airthmetic() {
		System.out.println("Airthmetic Exeception");
		throw new ArithmeticException();
	}

	public void anotatio() {
		System.out.println("Anotation Exeception");
		throw new AnnotationFormatError("Name");
	}

	public void Array() {
		System.out.println("Array Exeception");
		throw new ArrayStoreException();
	}

	public void Arrayout() {
		System.out.println("Arrayout Exeception");
		throw new ArrayIndexOutOfBoundsException();
	}

	public void Buffer() {
		System.out.println("Buffer Exeception");
		throw new BufferOverflowException();
	}

	public void BuffUnder() {
		System.out.println("BuffUnder Exeception");
		throw new BufferUnderflowException();
	}

	public void cann() {
		System.out.println("cann Exeception");
		throw new CannotRedoException();
	}

	public void conntundo() {
		System.out.println("conntundo Exeception");
		throw new CannotUndoException();
	}

	public void classcas() {
		System.out.println("classcas Exeception");
		throw new ClassCastException();
	}

	public void CMM() {
		System.out.println("CMM Exeception");
		throw new CMMException("name");
	}

	public void concurrent() {
		System.out.println("CMM Exeception");
		throw new ConcurrentModificationException();
	}

	public void data() throws DateTimeException {
		System.out.println("data Exeception");
		throw new DateTimeException("21/01/2000");
	}

	public void Dom() throws DOMException {
		System.out.println("Dom Exeception");
		throw new DOMException((short) 1, "Vinoda");
	}

	public void Empty() {
		System.out.println("Empty Exeception");
		throw new EmptyStackException();
	}

	public void Enum() {
		System.out.println("Enum Exeception");
		throw new EnumConstantNotPresentException(null, null);
	}

	public void Event() {
		System.out.println("Event Exeception");
		throw new EventException((short) 0, null);
	}

	public void File() throws FileAlreadyExistsException {
		System.out.println("File Exeception");
		throw new FileAlreadyExistsException("");
	}

	public void FileSy() {
		System.out.println("FileSy Exeception");
		throw new FileSystemAlreadyExistsException();
	}

	public void illagal() {
		System.out.println("illagal Exeception");
		throw new IllegalAccessError();
	}

	public void Illagal() {
		System.out.println("Illagal Exeception");
		throw new IllegalArgumentException();
	}

	public void ill() {
		System.out.println("ill Exeception");
		throw new IllegalAccessError();
	}

	public void image() {
		System.out.println("image Exeception");
		throw new ImagingOpException(null);
	}

	public void incom() {
		System.out.println("incom Exeception");
		throw new IncompatibleClassChangeError();
	}

	public void index() {
		System.out.println("index Exeception");
		throw new IndexOutOfBoundsException();
	}

	public void JMR() {
		System.out.println("JMR Exeception");
		throw new JMRuntimeException();
	}

	public void Mal() throws MalformedInputException {
		System.out.println("Mal Exeception");
		throw new MalformedInputException((short) 0);
	}

	public void nul() {
		System.out.println("nul Exeception");
		throw new NullPointerException();
	}

	public void mirr() {
		System.out.println("mirr Exeception");
		throw new MirroredTypesException(null);
	}

	public void reg() {
		System.out.println("reg Exeception");
		throw new RejectedExecutionException();
	}

	public void uncheck() {
		System.out.println("uncheck Exeception");
		throw new UncheckedIOException(null);
	}

	public void type() {
		System.out.println("type Exeception");
		throw new SecurityException();
	}

	public void unwon() {
		System.out.println("unwon Exeception");
		throw new WrongMethodTypeException();
	}

	public void miss() {
		System.out.println("unwon Exeception");
		throw new MissingFormatArgumentException(null);
	}

	public void typenot() {
		System.out.println("typenot Exeception");
		throw new TypeNotPresentException(null, null);
	}

}
