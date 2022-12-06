package com.xworkz.exeception.handling;

import java.awt.FontFormatException;
import java.awt.geom.NoninvertibleTransformException;
import java.beans.PropertyVetoException;
import java.io.NotActiveException;
import java.lang.instrument.IllegalClassFormatException;
import java.nio.channels.AlreadyBoundException;
import java.rmi.activation.ActivateFailedException;
import java.security.GeneralSecurityException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.cert.CertificateEncodingException;
import java.sql.SQLClientInfoException;
import java.text.ParseException;
import java.util.TooManyListenersException;
import java.util.concurrent.BrokenBarrierException;
import java.util.prefs.BackingStoreException;

import javax.activation.MimeTypeParseException;
import javax.activity.InvalidActivityException;
import javax.management.BadAttributeValueExpException;
import javax.management.ReflectionException;
import javax.management.openmbean.KeyAlreadyExistsException;
import javax.naming.TimeLimitExceededException;
import javax.script.ScriptException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.xml.bind.DataBindingException;
import javax.xml.bind.PropertyException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.MarshalException;
import javax.xml.parsers.ParserConfigurationException;

import org.omg.CORBA.portable.ApplicationException;
import org.xml.sax.SAXException;

public class Exeception {
	public void aclnot() throws AclNotFoundException {
		System.out.println("Exeception");
		throw new AclNotFoundException();
	}

	public void activat() throws ActivateFailedException {
		System.out.println("Exeception");
		throw new ActivateFailedException(null);
	}

	public void Alredy() {
		System.out.println("Exeception");
		throw new AlreadyBoundException();
	}

	public void Applica() throws ApplicationException {
		System.out.println("Exeception");
		throw new ApplicationException(null, null);
	}

	public void Back() throws BackingStoreException {
		System.out.println("Exeception");
		throw new BackingStoreException(" ");
	}

	public void bad() throws BadAttributeValueExpException {
		System.out.println("Exeception");
		throw new BadAttributeValueExpException(null);
	}

	public void badlocation() throws BadLocationException {
		System.out.println("Exeception");
		throw new BadLocationException(null, 0);
	}

	public void rocken() throws BrokenBarrierException {
		System.out.println("Exeception");
		throw new BrokenBarrierException();
	}

	public void certification() throws CertificateEncodingException {
		System.out.println("Exeception");
		throw new CertificateEncodingException();
	}

	public void Clone() throws CloneNotSupportedException {
		System.out.println("Exeception");
		throw new CloneNotSupportedException();
	}

	public void Data() {
		System.out.println("Exeception");
		throw new DataBindingException(null, null);
	}

	public void Font() throws FontFormatException {
		System.out.println("Exeception");
		throw new FontFormatException(null);
	}

	public void General() throws GeneralSecurityException {
		System.out.println("Exeception");
		throw new GeneralSecurityException();
	}

	public void Destroy() throws DestroyFailedException {
		System.out.println("Exeception");
		throw new DestroyFailedException();
	}

	public void Illigal() throws IllegalClassFormatException {
		System.out.println("Exeception");
		throw new IllegalClassFormatException("");
	}

	public void Invalid() throws InvalidActivityException {
		System.out.println("Exeception");
		throw new InvalidActivityException("");
	}

	public void Last() throws LastOwnerException {
		System.out.println("Exeception");
		throw new LastOwnerException();
	}

	public void Line() throws LineUnavailableException {
		System.out.println("Exeception");
		throw new LineUnavailableException();
	}

	public void marsha() throws MarshalException {
		System.out.println("Exeception");
		throw new MarshalException();
	}

	public void Kay() {
		System.out.println("Exeception");
		throw new KeyAlreadyExistsException();
	}

	public void keysele() throws KeySelectorException {
		System.out.println("Exeception");
		throw new KeySelectorException();
	}

	public void miodi() throws MidiUnavailableException {
		System.out.println("Exeception");
		throw new MidiUnavailableException();
	}

	public void mime() throws MimeTypeParseException {
		System.out.println("Exeception");
		throw new MimeTypeParseException();
	}

	public void Not() throws NotActiveException {
		System.out.println("Exeception");
		throw new NotActiveException();
	}

	public void noni() throws NoninvertibleTransformException {
		System.out.println("Exeception");
		throw new NoninvertibleTransformException(null);
	}

	public void Parse() throws ParseException {
		System.out.println("Exeception");
		throw new ParseException(null, 0);
	}

	public void Parser() throws ParserConfigurationException {
		System.out.println("Exeception");
		throw new ParserConfigurationException();
	}

	public void Property() throws PropertyVetoException {
		System.out.println("Exeception");
		throw new PropertyVetoException(null, null);
	}

	public void Reflect() throws ReflectionException {
		System.out.println("Exeception");
		throw new ReflectionException(null);
	}

	public void Reflective() throws ReflectiveOperationException {
		System.out.println("Exeception");
		throw new ReflectiveOperationException();
	}

	public void Saxe() throws SAXException {
		System.out.println("Exeception");
		throw new SAXException();
	}

	public void Script() throws ScriptException {
		System.out.println("Exeception");
		throw new ScriptException("");
	}

	public void SQl() throws SQLClientInfoException {
		System.out.println("Exeception");
		throw new SQLClientInfoException();
	}

	public void Timeout() throws TimeLimitExceededException {
		System.out.println("Exeception");
		throw new TimeLimitExceededException();
	}

	public void Too() throws TooManyListenersException {
		System.out.println("Exeception");
		throw new TooManyListenersException();
	}

}
