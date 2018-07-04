/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.wappm.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.wappm.ide.contentassist.antlr.internal.InternalWappmParser;
import org.xtext.example.wappm.services.WappmGrammarAccess;

public class WappmParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(WappmGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, WappmGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPageAccess().getAlternatives(), "rule__Page__Alternatives");
			builder.put(grammarAccess.getDynamicPageAccess().getAlternatives(), "rule__DynamicPage__Alternatives");
			builder.put(grammarAccess.getURLAccess().getAlternatives_1(), "rule__URL__Alternatives_1");
			builder.put(grammarAccess.getURLAccess().getAlternatives_1_1_1(), "rule__URL__Alternatives_1_1_1");
			builder.put(grammarAccess.getURL_ADDITIONAccess().getAlternatives(), "rule__URL_ADDITION__Alternatives");
			builder.put(grammarAccess.getAppTypesAccess().getAlternatives(), "rule__AppTypes__Alternatives");
			builder.put(grammarAccess.getWebModelAccess().getGroup(), "rule__WebModel__Group__0");
			builder.put(grammarAccess.getHypertextLayerAccess().getGroup(), "rule__HypertextLayer__Group__0");
			builder.put(grammarAccess.getStaticPageAccess().getGroup(), "rule__StaticPage__Group__0");
			builder.put(grammarAccess.getStaticPageAccess().getGroup_5(), "rule__StaticPage__Group_5__0");
			builder.put(grammarAccess.getStaticPageAccess().getGroup_5_3(), "rule__StaticPage__Group_5_3__0");
			builder.put(grammarAccess.getDetailPageAccess().getGroup(), "rule__DetailPage__Group__0");
			builder.put(grammarAccess.getDetailPageAccess().getGroup_7(), "rule__DetailPage__Group_7__0");
			builder.put(grammarAccess.getDetailPageAccess().getGroup_7_3(), "rule__DetailPage__Group_7_3__0");
			builder.put(grammarAccess.getIndexPageAccess().getGroup(), "rule__IndexPage__Group__0");
			builder.put(grammarAccess.getIndexPageAccess().getGroup_7(), "rule__IndexPage__Group_7__0");
			builder.put(grammarAccess.getIndexPageAccess().getGroup_7_3(), "rule__IndexPage__Group_7_3__0");
			builder.put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
			builder.put(grammarAccess.getContentLayerAccess().getGroup(), "rule__ContentLayer__Group__0");
			builder.put(grammarAccess.getWebClassAccess().getGroup(), "rule__WebClass__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getURLAccess().getGroup(), "rule__URL__Group__0");
			builder.put(grammarAccess.getURLAccess().getGroup_1_1(), "rule__URL__Group_1_1__0");
			builder.put(grammarAccess.getURL_ADDITIONAccess().getGroup_0(), "rule__URL_ADDITION__Group_0__0");
			builder.put(grammarAccess.getURL_ADDITIONAccess().getGroup_1(), "rule__URL_ADDITION__Group_1__0");
			builder.put(grammarAccess.getWebModelAccess().getNameAssignment_1(), "rule__WebModel__NameAssignment_1");
			builder.put(grammarAccess.getWebModelAccess().getHypertextAssignment_3(), "rule__WebModel__HypertextAssignment_3");
			builder.put(grammarAccess.getWebModelAccess().getContentAssignment_4(), "rule__WebModel__ContentAssignment_4");
			builder.put(grammarAccess.getHypertextLayerAccess().getHyperNameAssignment_1(), "rule__HypertextLayer__HyperNameAssignment_1");
			builder.put(grammarAccess.getHypertextLayerAccess().getPagesAssignment_3(), "rule__HypertextLayer__PagesAssignment_3");
			builder.put(grammarAccess.getStaticPageAccess().getNameAssignment_1(), "rule__StaticPage__NameAssignment_1");
			builder.put(grammarAccess.getStaticPageAccess().getUrlAssignment_4(), "rule__StaticPage__UrlAssignment_4");
			builder.put(grammarAccess.getStaticPageAccess().getLinksAssignment_5_2(), "rule__StaticPage__LinksAssignment_5_2");
			builder.put(grammarAccess.getStaticPageAccess().getLinksAssignment_5_3_1(), "rule__StaticPage__LinksAssignment_5_3_1");
			builder.put(grammarAccess.getDetailPageAccess().getNameAssignment_1(), "rule__DetailPage__NameAssignment_1");
			builder.put(grammarAccess.getDetailPageAccess().getDisplayedClassAssignment_3(), "rule__DetailPage__DisplayedClassAssignment_3");
			builder.put(grammarAccess.getDetailPageAccess().getUrlAssignment_6(), "rule__DetailPage__UrlAssignment_6");
			builder.put(grammarAccess.getDetailPageAccess().getLinksAssignment_7_2(), "rule__DetailPage__LinksAssignment_7_2");
			builder.put(grammarAccess.getDetailPageAccess().getLinksAssignment_7_3_1(), "rule__DetailPage__LinksAssignment_7_3_1");
			builder.put(grammarAccess.getIndexPageAccess().getNameAssignment_1(), "rule__IndexPage__NameAssignment_1");
			builder.put(grammarAccess.getIndexPageAccess().getDisplayedClassAssignment_3(), "rule__IndexPage__DisplayedClassAssignment_3");
			builder.put(grammarAccess.getIndexPageAccess().getUrlAssignment_6(), "rule__IndexPage__UrlAssignment_6");
			builder.put(grammarAccess.getIndexPageAccess().getLinksAssignment_7_2(), "rule__IndexPage__LinksAssignment_7_2");
			builder.put(grammarAccess.getIndexPageAccess().getLinksAssignment_7_3_1(), "rule__IndexPage__LinksAssignment_7_3_1");
			builder.put(grammarAccess.getLinkAccess().getPageAssignment_3(), "rule__Link__PageAssignment_3");
			builder.put(grammarAccess.getContentLayerAccess().getContentNameAssignment_1(), "rule__ContentLayer__ContentNameAssignment_1");
			builder.put(grammarAccess.getContentLayerAccess().getClassesAssignment_3(), "rule__ContentLayer__ClassesAssignment_3");
			builder.put(grammarAccess.getWebClassAccess().getNameAssignment_1(), "rule__WebClass__NameAssignment_1");
			builder.put(grammarAccess.getWebClassAccess().getAttributesAssignment_3(), "rule__WebClass__AttributesAssignment_3");
			builder.put(grammarAccess.getWebClassAccess().getUniqueIdentifierAssignment_5(), "rule__WebClass__UniqueIdentifierAssignment_5");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
			builder.put(grammarAccess.getURLAccess().getAdditionAssignment_1_1_1_1(), "rule__URL__AdditionAssignment_1_1_1_1");
			builder.put(grammarAccess.getURL_ADDITIONAccess().getNameAssignment_0_1(), "rule__URL_ADDITION__NameAssignment_0_1");
			builder.put(grammarAccess.getURL_ADDITIONAccess().getNameAssignment_1_1(), "rule__URL_ADDITION__NameAssignment_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private WappmGrammarAccess grammarAccess;

	@Override
	protected InternalWappmParser createParser() {
		InternalWappmParser result = new InternalWappmParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public WappmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WappmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
