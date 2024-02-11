## WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
A.  Create your subgroup and project by logging into GitLab using the web link provided and using the GitLab How-To web link
    No files were edited and no pushes were made at this point.
B. Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J.
    No files were edited and no pushes were made at this point.
C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
01-25-2024
    mainscreen.html
        Line 14: The title tag was modified from "My Bicycle Shop" to "Gentlemen's Shoewear" to reflect the chosen customer for this project. 
        Line 19: The h1 tag with the default text of "Shop" was changed to "Gentlemen's Shoewear", the name of the customer's business.
        Line 21: The h2 tag was amended with the inclusion of "Shoe Parts", to clarify the parts being offered.
        Line 53: THe h2 tag with the default text of "Products" was changed to "Shoes", to specify the products being offered.

    A push was made with message "mainscreen.html was modified to reflect the customer's shoe selling business. The title tag and h1 tag were changed to the business name, Gentlemen's Shoewear. Both of the
        h2 tags of parts and products were changed to reflect the business as well".

D.  Add an About page to the application to describe your chosen customer's company to web viewers and include navigation to and from the About page and the main screen.
01-26-2024
    about.html
        A new file, about.html, was created by using mainscreen.html as the template
        Line 21: The h2 tag containing "shoe parts" was changed to "About Us" to reflect the new function of the page.
        Lines 22-52: The entire form and table under the first h2 tag was removed, as this header no longer needs the form that the template used.
        Lines 53-88: The entire second heading under the h2 tag was removed, as this new page only needs one header from the old template.
01-27-2024
    about.html
        Lines 22-28: A div tag was added to contain the new description for the company. 
        Lines 20-22: An a tag was placed to link back to the mainscreen.html page.
        mainscreen.html
        Lines 21-23: An a tag was placed to link to the about.html page.

    A push to the remote repository was made, including the additions to mainscreen.html and the new file about.html. The push contained the message: "A new file about.html was created from the mainscreen.html template, and included a small message about the company's history and purpose. Navigation was included to link back to mainscreen.html, and that same file was also updated to include navigation to about.html".

    A second push was made to reflect the addition of these notes in the README.md file, the message contained: "README.md was updated to include the notes for all of the changes thus far".

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
01-27-2024
    BootStrapData.java
        Lines 43-177: The example code for creating a part was duplicated five times, and was placed into an if statement to check that there is no parts before adding more.
02-01-2024
    BootStrapData.java
	    Line 3: InhousePart was imported, which then shifted every other line of code down.
	    Line 42-83: An if statement was made to check if partRepository.count() was equal to zero, and if it is it made five parts and set the variables for each.
	    Lines 86-97: An if statement was made to check if productRepository.count() was equal to zero, and if it is it made five products and set the variables for each.
    AboutScreenController.java
	    Controller was made to map the about url whenever the get() method calls for the about page.
	    about.html
	    Line 20: The a tag was changed from "mainscreen.html" to "mainscreen".
    PurchaseProduct Controller.java
	    Controller was made for next step of the assignment, but is currently in progress.

    All of the changes and additions above were pushed with the message "Bootstrap was updated to fill the parts repository and prodcuts repository if they are empty. A controller was made to map the about page url. A controller was made for the next task of making a buy now button. Finally the about page was updated to properly route back to the mainscreen.html page".

F.  Add a Buy Now button to your product list.
02-05-2024
	mainscreen.html
		Line 86: A new line was inserted copying the format from the prior two buttons, inserting a buy now button that references a newly created PurchaseProductController.java.
	PurchaseProductController.java
		A controller was made to handle the newly created buy now button using GetMapping of "buyProduct". It initializes the repository, creates an optional product so there is no error if it does not exist in the repository, and will allow the purchase of the product and deducts the inventory by one. If successful it brings the user to a new page to show their successful purchase, and if it fails it brings them to a new page that informs them the product is out of stock.
	AboutScreenController.java
		Line 12: Syntax was fixed for the @GetMapping.
	buyForm.html
		A new html page was created for the user to be sent to that indicates their purchase was successful, and links back to mainscreen.html.
	outOfStock.html
		A new html page was created for the user to be sent to that indicates their purchase was unsuccessful due to the item being out of stock, and links back to mainscreen.html.
	BuyFormController.java
		A controller was made to handle the newly created buyForm.html, and properly send the user to it after a successful purchase.
	outOfStockController.java
		A controller was made to handle the newly created outOfStock.html, and properly send the user to it after an unsuccessful purchase. 

	All of the changes and additions above were pushed with the message "A button was created in mainscreen.html to allow the user to purchase products. A PurchaseProductController.java was made to handle the purchase as long as the inventory is greater than zero. AboutScreenController.java was updated to fix the syntax. The buyForm.html and outOfStock.html pages were created to visually indicate the successful or unsuccessful purchase of the product respectively, and a PurchaseProductController.java and a OutOfStockController.java were made to handle the newly created html files.".
    
G.  Modify the parts to track maximum and minimum inventory.
02-08-2024
	Part.java
		Lines 32-33: A new integer variable invMin was declared using annotation @min, this is used to store the minimum integer that inv can reach.
		Lines 35-36: A new integer variable invMax was declared using annotation @max, this is used to store the maximum integer that inv can reach.
		Lines 58-65: A new constructor for Part was made including the two new variables invMin and invMax.
		Lines 105-119: A getter function and setter function were generated for each of the new variables, resulting in four new functions.
	BootStrapData.java
		Lines 49-50: Two setter functions were called to set the counter object with a default invMin and invMax value.
		Line 54: Typo was fixed in setCompanyName from the businesses own name to default store "Jim's Shoe Parts".
		Lines 59-60: Two setter functions were called to set the sole object with a default invMin and invMax value.
		Lines 70-71: Two setter functions were called to set the tongue object with a default invMin and invMax value.
		Lines 80-81: Two setter functions were called to set the laces object with a default invMin and invMax value.
		Lines 90-91: Two setter functions were called to set the toecapobject with a default invMin and invMax value.
	OutsourcedPartForm.html
		Lines 25-30: Two input fields were added to the form to allow the input of the invMin and invMax variables.
	InhousePartForm.html
		Lines 24-29: Two input fields were added to the form to allow the input of the invMin and invMax variables.
	AddInhousePartController.java
		Lines 49-53: A new if statement was added to the end of the submitForm method, only allowing the object to be saved if the part's inventory was within range of invMin and invMax.
	AddOutsourcedPartController.java
		Lines 49-61: A new if statement was added to the end of the submitForm method, only allowing the object to be saved if the part's inventory was within range of invMin and invMax.
	application.properties
		Line 6: The database name was changed to "Gentlemens-Shoewear-DB".
	InventoryError.html
		A new html page was created in the case that the user enters a inventory amount that is not within their selected range. The page informs them of their error, then offers a link back to the previous page. This page is exclusively for outhouse parts.
	InventoryErrorInhouse.html
		A new html page was created in the case that the user enters a inventory amount that is not within their selected range. The page informs them of their error, then offers a link back to the previous page. This page is exclusively for inhouse parts.
	InventoryErrorController.java
		A new controller was made to add the InventoryError page to the model.
	InventoryErrorInhouse.html
		A new controller was made to add the InventoryErrorInhouse page to the model.
	All of the changes and additions were pushed with the message "Two new variables, invMin and invMax, were created in parts.java to control the range of the inventory variable. A getter and setter function were each made for the two new variables, and the setter functions were added to the default inventory in BootStrapData.java. The option to add these new variables were added to OutsourcedPartForm.html and InhousePartForm.html, and their controllers were updated to only allow items to be saved or added if they fell within the invMin and invMax variables. Error pages were made for each form, as well as controllers to add those pages to the models. Finally the database name was changed to reflect the business name.".
	
 H.  Add validation for between or at the maximum and minimum fields.
02-10-2024
	InventoryError.html
		Lines 8-9: The error message was changed to be specific for inventory errors less than than the set minimum, stating "The inventory entered is lower than the set minimum". The link was also changed to a general a tag for returning to the previous page.
	InventoryErrorMaximum.html
		A new html page was added to function similarly to InventoryError.html, except it is specifically for when the inventory exceeds the maximum. The same a tag was included for a general link back to the previous page.
	PreviousPageController.java
		A new controller was made for any error page that wants to send the user back to their previous page, whenever "/previousPage" is mapped.
	AddInhousePartController.java
		Line 44: The else declaration was moved up to reduce the amount of blank space in the document.
		Lines 49-55: The if else statement was divided, separating the two conditions of being lower than invMin and higher than invMax. It checks invmin first, then invmax, then if those conditions are met the part will be saved.
	AddOutsourcedPartController.java
		Line 45: The else declaration was moved up to reduce the amount of blank space in the document.
		Lines 53-60 The if else statement was divided, separating the two conditions of being lower than invMin and higher than invMax. It checks invmin first, then invmax, then if those conditions are met the part will be saved.
	EnufPartsValidator.java
			Line 36: Another condition was added to the if statement that returns false, stating that if getInv -1 is less than invMin it will reject the transaction.
	ValidEnufParts.java
			Line 20: The message string was changed to "There aren't enough parts in the inventory for this product.".

	All of the changes and additions above were pushed with the message "The inventory error page was ammended to specify for the invMin variable, while an InventoryErrorMaximum.html page was added specifically for invMax. A new PreviousPageController was created for all of the error page to simply link back to their prior page. Both AddInhousePartController.java and AddOutsourcedPartController.java were changed to distinguish between invMin and invMax errors. EnufPartsValidator.java was changed to also reject the product if it would bring the needed part below invMin, and ValidEnufParts.java was modified to accomodate the newest error.".

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
02-10-2024
	PartTest.java
		Lines 104-138: Unit tests were created for invMin and invMax, creating two functions each testing their getter and setter functions.
		The changes above were pushed with the message "Unit tests were created for invMin and invMax, creating two functions each testing their getter and setter functions.".

J.  Remove the class files for any unused validators in order to clean your code.
02-11-2024
    No files were edited and no pushes were made at this point, as there were not any unused validators.

    A push was made to finalize the project in its current state with the message "Final push to update README.md before project is placed into a ZIP.". 