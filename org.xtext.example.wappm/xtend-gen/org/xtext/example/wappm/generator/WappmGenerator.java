/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.wappm.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.wappm.wappm.AppTypes;
import org.xtext.example.wappm.wappm.Attribute;
import org.xtext.example.wappm.wappm.ContentLayer;
import org.xtext.example.wappm.wappm.HypertextLayer;
import org.xtext.example.wappm.wappm.WebClass;
import org.xtext.example.wappm.wappm.WebModel;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class WappmGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<WebModel> _filter = Iterables.<WebModel>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), WebModel.class);
    for (final WebModel w : _filter) {
      String _name = w.getName();
      String _plus = (_name + ".java");
      fsa.generateFile(_plus, 
        this.compile(w));
    }
  }
  
  public CharSequence compile(final WebModel w) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = w.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compile = this.compile(w.getHypertext());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compile_1 = this.compile(w.getContent());
    _builder.append(_compile_1);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final HypertextLayer h) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compile(final ContentLayer c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<WebClass> _classes = c.getClasses();
      for(final WebClass cl : _classes) {
        CharSequence _compile = this.compile(cl);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final WebClass cl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    String _name = cl.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes = cl.getAttributes();
      for(final Attribute a : _attributes) {
        _builder.append("\t");
        CharSequence _compile = this.compile(a);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    AppTypes _type = a.getType();
    _builder.append(_type);
    _builder.append(" ");
    String _name = a.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
