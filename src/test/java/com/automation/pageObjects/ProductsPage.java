package com.automation.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductsPage extends PageObject {

    @FindBy(xpath = "//span[@class='title']")
    private WebElementFacade locationLabel;

    @FindBy(id = "react-burger-menu-btn")
    private WebElementFacade menuBtn;

    @FindBy(id = "logout_sidebar_link")
    private WebElementFacade logoutLink;

    @FindBy(xpath = "//*[@data-test='product_sort_container']")
    private WebElementFacade sortBtn;

    @FindBy(xpath = "//*[@value=\"az\"]")
    private WebElementFacade sortOptionByNameAsc;
    @FindBy(xpath = "//*[@value=\"za\"]")
    private WebElementFacade sortOptionByNameDsc;
    @FindBy(xpath = "//*[@value=\"lohi\"]")
    private WebElementFacade sortOptionByPriceAsc;
    @FindBy(xpath = "//*[@value=\"hilo\"]")
    private WebElementFacade sortOptionByPriceDsc;

    @FindBy(xpath = "(//*[@class=\"inventory_item_name\"])[1]")
    private WebElementFacade firstProductLabel;
    @FindBy(xpath = "(//*[@class=\"inventory_item_name\"])[last()]")
    private WebElementFacade lastProductLabel;

    @FindBy(xpath = "//*[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElementFacade backPackProductAddBtn;
    @FindBy(xpath = "//*[@data-test='remove-sauce-labs-bolt-t-shirt']")
    private WebElementFacade backPackProductRmBtn;
    @FindBy(id = "shopping_cart_container")
    private WebElementFacade cartBtn;

    public WebElementFacade getBackPackProductAddBtn() {
        return backPackProductAddBtn;
    }

    public WebElementFacade getBackPackProductRmBtn() {
        return backPackProductRmBtn;
    }

    public WebElementFacade getCartBtn() {
        return cartBtn;
    }

    public WebElementFacade getFirstProductLabel() {
        return firstProductLabel;
    }

    public WebElementFacade getLastProductLabel() {
        return lastProductLabel;
    }

    public WebElementFacade getSortOptionByPriceAsc() {
        return sortOptionByPriceAsc;
    }

    public WebElementFacade getSortOptionByPriceDsc() {
        return sortOptionByPriceDsc;
    }

    public WebElementFacade getSortOptionByNameAsc() {
        return sortOptionByNameAsc;
    }

    public WebElementFacade getSortOptionByNameDsc() {
        return sortOptionByNameDsc;
    }

    public WebElementFacade getSortBtn() {
        return sortBtn;
    }

    public WebElementFacade getLogoutLink() {
        return logoutLink;
    }

    public WebElementFacade getMenuBtn() {
        return menuBtn;
    }

    public WebElementFacade getLocationLabel() {
        return locationLabel;
    }
}
