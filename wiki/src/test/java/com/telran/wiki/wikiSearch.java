package com.telran.wiki;

import org.testng.Assert;
import org.testng.annotations.Test;

public class wikiSearch extends TestBase1 {

    @Test
    public void searchInWiki() {
        String searchWord="dogo argentino";
        frwork.printInSearchAndGo(searchWord);
        Assert.assertEquals(frwork.findArticleTitle(), searchWord.toLowerCase());
    }
}
