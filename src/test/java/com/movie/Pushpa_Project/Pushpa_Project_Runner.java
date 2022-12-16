package com.movie.Pushpa_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.Imdb_page;
import com.POM.Pushpa_Imdb;
import com.POM.Pushpa_Wiki;
import com.POM.Wiki_Page;

import java.awt.AWTException;


public class Pushpa_Project_Runner extends Base_Pushpa {

	@Test(priority = 0)
	public void browser_Launch() {
		browser_Launch("chrome");
	}

	@Test(priority = 0)
	public void imdb_Launch() {
		url_Launch("https://www.imdb.com/");
	}

	@Test(priority = 1)
	public void imdb_Search() throws AWTException {
		Imdb_page imdbpage = new Imdb_page(Base_Pushpa.driver);
		wait_Method();
		pass_Input(imdbpage.getImdbSearch(), "Pushpa");
		click_Element(imdbpage.getPushpa_Select());
	}

	@Test(priority = 2)
	public void pushpa_Details_Imdb() {
		Pushpa_Imdb pimdb = new Pushpa_Imdb(Base_Pushpa.driver);
		wait_Method();
		System.out.println("Imdb details about the Movie Pushpa:The Rise");
		scroll_Down(pimdb.getReleaseDateImdb());
		System.out.println(pimdb.getReleaseDateImdb().getText());
		System.out.println(pimdb.getCountryImdb().getText());
	}

	@Test(priority = 3)
	public void wiki_Launch() {
		wait_Method();
		navigate("https://www.wikipedia.org/");
	}

	@Test(priority = 4)
	public void wiki_Search() throws AWTException {
		Wiki_Page wikipage = new Wiki_Page(Base_Pushpa.driver);
		wait_Method();
		pass_Input(wikipage.getWikiSearch(), "Pushpa");
		robot_Click();
	}

	@Test(priority = 5)
	public void pushpa_Details_Wiki() {
		Pushpa_Wiki pwiki = new Pushpa_Wiki(Base_Pushpa.driver);
		wait_Method();
		System.out.println("Wikipedia details about the Movie Pushpa:The Rise");
		String wikiReleaseDate = pwiki.getReleaseDateWiki().getText();
		String wikiCountry = pwiki.getCountryWiki().getText();

		System.out.println(pwiki.getReleaseDateWiki().getText());
		System.out.println(pwiki.getCountryWiki().getText());
		Assert.assertEquals(wikiReleaseDate, "December 17, 2021 (United States)");
		Assert.assertEquals(wikiCountry, "India");

	}

	@Test(priority = 7)
	public void close_Driver() {
		wait_Method();
		close();
	}

}
