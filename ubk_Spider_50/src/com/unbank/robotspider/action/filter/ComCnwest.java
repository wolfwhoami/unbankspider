package com.unbank.robotspider.action.filter;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.unbank.robotspider.action.model.normal.BaseFilter;
import com.unbank.robotspider.action.model.normal.FilterLocator;

@Service
public class ComCnwest extends BaseFilter {
	private String domain[] = new String[] {"house.cnwest.com" };

	public ComCnwest() {
		for (int i = 0; i < domain.length; i++) {
			FilterLocator.getInstance().register(domain[i], this);
		}

	}

	@Override
	public Element removeNoNeedHtmlElement(String url, Document document,
			String title) {

		Element element = document.select("#fontzoom").first();
		return element;
	}

	@Override
	public void formatElements(Element maxTextElement) {
		super.formatElements(maxTextElement);
	}

	@Override
	public void saveImage(Element maxTextElement, String url) {
		super.saveImage(maxTextElement, url);
	}

	@Override
	public String replaceStockCode(String content) {
		return super.replaceStockCode(content);
	}

	@Override
	public String replaceSpechars(String content) {
		String str = super.replaceSpechars(content);
		return str;
	}

	@Override
	public String addTag(String content) {
		return super.addTag(content);
	}

}
