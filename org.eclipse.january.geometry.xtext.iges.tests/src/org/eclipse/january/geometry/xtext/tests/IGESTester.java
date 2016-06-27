package org.eclipse.january.geometry.xtext.tests;

import static org.junit.Assert.*;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.january.geometry.xtext.IGESStandaloneSetup;
import org.eclipse.january.geometry.xtext.iGES.*;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

public class IGESTester {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Path path = FileSystems.getDefault().getPath("src", "org", "eclipse", "january", "geometry", "xtext",
				"tests", "resources", "test.iges");
		Injector injector = new IGESStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createFileURI(path.toFile().getAbsolutePath()), true);

		IGES data = (IGES) resource.getContents().get(0);
		
		System.out.println(data.getStart());
		
		List<Value> values = data.getGlobal().getValues();
		
		for(Value v: values) {
			if (v instanceof HString) {
				System.out.print(((HString)v).getVal()+",");
			}else if (v instanceof Pointer) {
				System.out.print(((Pointer)v).getVal()+",");
			} else {
				System.out.print(((Param)v).getVal()+",");
			}
		}
		System.out.println();
		
		List<Entry> entries = data.getData().getEntries();
		for(Entry e: entries) {
			System.out.println(e.getType()+" "+e.getParamData()+" "+e.getStructure()+" "+e.getLineFont()+" "+e.getLevel()+" "+e.getView()+" "+e.getTransformMatrix()+" 0 "+e.getStatus()+" "+e.getIndex()+"\n"
						+e.getType()+" "+e.getLineWeight()+" "+e.getColor()+" "+e.getParamLines()+" "+e.getForm()+" "+e.getSubNum()+" ");
		}
		
		List<PEntry> parameters = data.getParameters().getEntries();
		for(PEntry e: parameters) {
			System.out.print(e.getType()+",");
			for(Value v: e.getValues()) {
				if (v instanceof Pointer) {
					System.out.print(((Pointer)v).getVal()+",");
				} else {
					System.out.print(((Param)v).getVal()+",");
				}
			}
			System.out.println("    P "+e.getIndicies().get(0));
		}
		System.out.println(data.getEnd());

	}

}
