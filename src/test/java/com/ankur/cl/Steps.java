package com.ankur.cl;

import com.ankur.commons.CommonConstants;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Steps File To Perform Actions
 * Created by ankur on 6/26/16.
 */
public class Steps {

    @Given("^I am able to open criagslist rss$")
    public void i_am_able_to_open_criagslist_rss() throws Throwable {
        Client client=Client.create();
        WebResource webResource=client.resource(CommonConstants.baseURL+"/search/cto?auto_title_status=1&amp;format=rss&amp;max_auto_miles=100000&amp;max_price=10000&amp;postal=97006&amp;search_distance=50");
        ClientResponse clientResponse =webResource.get(ClientResponse.class);
        String xmlData=clientResponse.getEntity(String.class);
        //Todo: add handeler here to parse out the xml and give back the ArrayList
}

    @When("^I go through all the pages of content$")
    public void i_go_through_all_the_pages_of_content() throws Throwable {
    }

    @When("^I am able to parse the data$")
    public void i_am_able_to_parse_the_data() throws Throwable {
    }

    @Then("^I should be able to save it into elasticsearch$")
    public void i_should_be_able_to_save_it_into_elasticsearch() throws Throwable {
    }
}
