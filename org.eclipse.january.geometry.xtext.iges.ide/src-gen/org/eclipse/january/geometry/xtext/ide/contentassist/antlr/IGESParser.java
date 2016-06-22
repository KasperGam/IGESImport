/*
 * generated by Xtext 2.9.1
 */
package org.eclipse.january.geometry.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.january.geometry.xtext.ide.contentassist.antlr.internal.InternalIGESParser;
import org.eclipse.january.geometry.xtext.services.IGESGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class IGESParser extends AbstractContentAssistParser {

	@Inject
	private IGESGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalIGESParser createParser() {
		InternalIGESParser result = new InternalIGESParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getParametersAccess().getEntriesAlternatives_0(), "rule__Parameters__EntriesAlternatives_0");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getStartLineAccess().getAlternatives_0(), "rule__StartLine__Alternatives_0");
					put(grammarAccess.getIGESAccess().getGroup(), "rule__IGES__Group__0");
					put(grammarAccess.getGlobalAccess().getGroup(), "rule__Global__Group__0");
					put(grammarAccess.getGlobalAccess().getGroup_1(), "rule__Global__Group_1__0");
					put(grammarAccess.getEntryAccess().getGroup(), "rule__Entry__Group__0");
					put(grammarAccess.getPEntryAccess().getGroup(), "rule__PEntry__Group__0");
					put(grammarAccess.getPMultiEntryAccess().getGroup(), "rule__PMultiEntry__Group__0");
					put(grammarAccess.getPMultiEntryAccess().getGroup_0(), "rule__PMultiEntry__Group_0__0");
					put(grammarAccess.getHStringAccess().getGroup(), "rule__HString__Group__0");
					put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
					put(grammarAccess.getPointerAccess().getGroup(), "rule__Pointer__Group__0");
					put(grammarAccess.getEndAccess().getGroup(), "rule__End__Group__0");
					put(grammarAccess.getStartLineAccess().getGroup(), "rule__StartLine__Group__0");
					put(grammarAccess.getIGESAccess().getStartAssignment_0(), "rule__IGES__StartAssignment_0");
					put(grammarAccess.getIGESAccess().getGlobalAssignment_1(), "rule__IGES__GlobalAssignment_1");
					put(grammarAccess.getIGESAccess().getDataAssignment_2(), "rule__IGES__DataAssignment_2");
					put(grammarAccess.getIGESAccess().getParametersAssignment_3(), "rule__IGES__ParametersAssignment_3");
					put(grammarAccess.getIGESAccess().getEndAssignment_4(), "rule__IGES__EndAssignment_4");
					put(grammarAccess.getStartAccess().getLinesAssignment(), "rule__Start__LinesAssignment");
					put(grammarAccess.getGlobalAccess().getValuesAssignment_1_0(), "rule__Global__ValuesAssignment_1_0");
					put(grammarAccess.getGlobalAccess().getValuesAssignment_2(), "rule__Global__ValuesAssignment_2");
					put(grammarAccess.getDataAccess().getEntriesAssignment(), "rule__Data__EntriesAssignment");
					put(grammarAccess.getEntryAccess().getTypeAssignment_1(), "rule__Entry__TypeAssignment_1");
					put(grammarAccess.getEntryAccess().getParamDataAssignment_3(), "rule__Entry__ParamDataAssignment_3");
					put(grammarAccess.getEntryAccess().getStructureAssignment_5(), "rule__Entry__StructureAssignment_5");
					put(grammarAccess.getEntryAccess().getLineFontAssignment_7(), "rule__Entry__LineFontAssignment_7");
					put(grammarAccess.getEntryAccess().getLevelAssignment_9(), "rule__Entry__LevelAssignment_9");
					put(grammarAccess.getEntryAccess().getViewAssignment_11(), "rule__Entry__ViewAssignment_11");
					put(grammarAccess.getEntryAccess().getTransformMatrixAssignment_13(), "rule__Entry__TransformMatrixAssignment_13");
					put(grammarAccess.getEntryAccess().getStatusAssignment_17(), "rule__Entry__StatusAssignment_17");
					put(grammarAccess.getEntryAccess().getIndexAssignment_20(), "rule__Entry__IndexAssignment_20");
					put(grammarAccess.getEntryAccess().getLineWeightAssignment_25(), "rule__Entry__LineWeightAssignment_25");
					put(grammarAccess.getEntryAccess().getColorAssignment_27(), "rule__Entry__ColorAssignment_27");
					put(grammarAccess.getEntryAccess().getParamLinesAssignment_29(), "rule__Entry__ParamLinesAssignment_29");
					put(grammarAccess.getEntryAccess().getFormAssignment_31(), "rule__Entry__FormAssignment_31");
					put(grammarAccess.getEntryAccess().getEntityLabelAssignment_33(), "rule__Entry__EntityLabelAssignment_33");
					put(grammarAccess.getEntryAccess().getSubNumAssignment_35(), "rule__Entry__SubNumAssignment_35");
					put(grammarAccess.getParametersAccess().getEntriesAssignment(), "rule__Parameters__EntriesAssignment");
					put(grammarAccess.getPEntryAccess().getTypeAssignment_0(), "rule__PEntry__TypeAssignment_0");
					put(grammarAccess.getPEntryAccess().getValuesAssignment_1(), "rule__PEntry__ValuesAssignment_1");
					put(grammarAccess.getPEntryAccess().getDIndexAssignment_4(), "rule__PEntry__DIndexAssignment_4");
					put(grammarAccess.getPEntryAccess().getIndiciesAssignment_7(), "rule__PEntry__IndiciesAssignment_7");
					put(grammarAccess.getPMultiEntryAccess().getValuesAssignment_0_0(), "rule__PMultiEntry__ValuesAssignment_0_0");
					put(grammarAccess.getPMultiEntryAccess().getDIndexAssignment_0_2(), "rule__PMultiEntry__DIndexAssignment_0_2");
					put(grammarAccess.getPMultiEntryAccess().getIndiciesAssignment_0_5(), "rule__PMultiEntry__IndiciesAssignment_0_5");
					put(grammarAccess.getPMultiEntryAccess().getValuesAssignment_1(), "rule__PMultiEntry__ValuesAssignment_1");
					put(grammarAccess.getHStringAccess().getValAssignment_1(), "rule__HString__ValAssignment_1");
					put(grammarAccess.getParamAccess().getValAssignment_1(), "rule__Param__ValAssignment_1");
					put(grammarAccess.getPointerAccess().getValAssignment_1(), "rule__Pointer__ValAssignment_1");
					put(grammarAccess.getEndAccess().getSvalAssignment_2(), "rule__End__SvalAssignment_2");
					put(grammarAccess.getEndAccess().getGvalAssignment_5(), "rule__End__GvalAssignment_5");
					put(grammarAccess.getEndAccess().getDvalAssignment_8(), "rule__End__DvalAssignment_8");
					put(grammarAccess.getEndAccess().getPvalAssignment_11(), "rule__End__PvalAssignment_11");
					put(grammarAccess.getEndAccess().getTvalAssignment_15(), "rule__End__TvalAssignment_15");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalIGESParser typedParser = (InternalIGESParser) parser;
			typedParser.entryRuleIGES();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}

	public IGESGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IGESGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}