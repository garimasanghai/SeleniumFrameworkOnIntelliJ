Baics of Selenium Programming
Creating a framework thereafter
**Locater Notes:**
  Selenium Locators:
     Locators in Selenium are used to identify elements in a web page. Choosing the right
     locator is critical for test reliability and speed. Selenium provides several types of locators.

     Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

     Navigate to a sample website
        driver.get("https://example.com/login");

     Types of Selenium Locators

      1. Locator by ID**
       - ID is the fastest and most reliable locator.
       - Use when the element has a unique and stable ID.
        WebElement username = driver.findElement(By.id("user-id"));
        username.sendKeys("test_user");

      2. Locator by Name**
       - Useful when ID is not present, but the `name` attribute is unique.
       - Avoid if multiple elements share the same `name`.
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password123");

     3. Locator by Class Name**
       - Best for elements with unique class attributes.
       - Avoid for generic classes that apply to multiple elements.
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();

     4. Locator by Tag Name**
      - Locates elements by their tag, e.g., `input`, `button`, `a`.
      - Often used for handling collections of elements.
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            System.out.println(link.getText()); // Prints the text of all anchor tags on the page.
        }

     5. Locator by Link Text**
      - Locates a link (anchor tag `<a>`) by its exact text.
      - Avoid if the link text is dynamic or changes frequently.
        WebElement forgotPassword = driver.findElement(By.linkText("Forgot Password?"));
        forgotPassword.click();

     6. Locator by Partial Link Text**
      - Locates a link using partial matching of the link text.
      - Ideal for dynamic or lengthy link texts.
        WebElement partialLink = driver.findElement(By.partialLinkText("Forgot"));
        partialLink.click();

     7. Locator by CSS Selector**
      - A powerful and efficient locator using CSS rules.
      - Syntax:
      - By ID: `#id`
      - By class: `.class`
      - By attribute: `[attribute='value']`
      - Hierarchical: `parent child` or `parent > child`
        WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
        searchBox.sendKeys("Selenium CSS Selector");

      8. Locator by XPath**
       - The most versatile locator, especially for dynamic elements.
       - Syntax:
       - Absolute XPath: `/html/body/div[1]/div/input` (Avoid as it is brittle)
       - Relative XPath: `//tag[@attribute='value']`
        WebElement searchBoxXPath = driver.findElement(By.xpath("//input[@name='q']"));
        searchBoxXPath.sendKeys("Selenium XPath Example");

        // **Additional Notes on Locators**

        // **Best Practices**
        // - Prefer ID > Name > CSS Selector for speed and reliability.
        // - Use XPath sparingly, mainly for complex structures.
        // - Avoid absolute XPath as it is prone to breaking with DOM changes.

        // **Dynamic Elements**
        // - Use contains(), starts-with(), or ends-with() in XPath to handle dynamic attributes.
        // Example: `//input[contains(@id, 'user-')]`

        // **Index-Based Selection**
        // - Use CSS or XPath to select an element based on index.
        // CSS Example: `ul li:nth-child(3)`
        // XPath Example: `(//ul/li)[3]`

        // **Compound Locators**
        // - Combine attributes for better specificity.
        // Example CSS: `input[type='text'][name='username']`
        // Example XPath: `//input[@type='text' and @name='username']`

        // **Error Handling**
        // - Use try-catch blocks to handle cases where locators fail.
        try {
            WebElement optionalElement = driver.findElement(By.id("optional-element"));
            optionalElement.click();
        } catch (Exception e) {
            System.out.println("Element not found: " + e.getMessage());
        }

        // **Validation**
        // - Validate elements exist before interacting.
        List<WebElement> elements = driver.findElements(By.tagName("input"));
        if (!elements.isEmpty()) {
            System.out.println("Found " + elements.size() + " input elements.");
        }

        // Close the browser
        driver.quit();

**Locators Extended**

1. By Class
        // ==========================
        // The By class provides static methods for locating elements using different types of locators.
        // Common methods include:
        // By.id() - Locates an element by its unique ID.
        // By.name() - Locates an element by its name attribute.
        // By.className() - Locates an element by its class name.
        // By.tagName() - Locates all elements with a specific HTML tag.
        // By.linkText() - Locates a hyperlink using its exact visible text.
        // By.partialLinkText() - Locates a hyperlink using partial visible text.
        // By.cssSelector() - Locates elements using CSS selectors.
        // By.xpath() - Locates elements using XPath expressions.

        // Example using the By class:
        WebElement elementById = driver.findElement(By.id("username")); // Locates element by ID
        WebElement elementByXPath = driver.findElement(By.xpath("//input[@type='text']")); // Locates using XPath


        // ==========================
        // 2. WebDriver Class
        // ==========================
        // The WebDriver class interacts with the browser and provides methods to locate elements.
        // Two important methods:
        // findElement(By locator): Locates a single element.
        // findElements(By locator): Locates multiple elements matching the locator.

        // Example:
        WebElement username = driver.findElement(By.name("username")); // Finds a single element
        List<WebElement> links = driver.findElements(By.tagName("a")); // Finds multiple elements


        // ==========================
        // 3. WebElement Class
        // ==========================
        // Represents an HTML element and provides methods for interacting with it.
        // Common methods include:
        // click() - Clicks the element.
        // sendKeys(String text) - Types the given text into an input field.
        // clear() - Clears the text in an input or text area.
        // getText() - Retrieves the visible text of the element.
        // getAttribute(String attribute) - Fetches the value of a specific attribute (e.g., href).
        // isDisplayed() - Checks if the element is visible on the page.

        // Example:
        WebElement loginButton = driver.findElement(By.className("btn-login"));
        loginButton.click(); // Clicks the login button


        // ==========================
        // 4. Select Class
        // ==========================
        // The Select class is designed for interacting with <select> dropdowns.
        // Common methods include:
        // selectByIndex(int index) - Selects an option by its index.
        // selectByValue(String value) - Selects an option by its value attribute.
        // selectByVisibleText(String text) - Selects an option by its visible text.
        // getOptions() - Retrieves all options in the dropdown.
        // getFirstSelectedOption() - Gets the currently selected option.

        // Example:
        WebElement dropdown = driver.findElement(By.id("country"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("India"); // Selects option "India"


        // ==========================
        // 5. Actions Class
        // ==========================
        // Provides advanced user interactions like hover, drag-and-drop, and right-click.
        // Common methods include:
        // moveToElement(WebElement element) - Moves the mouse to a specific element.
        // click() - Performs a click at the current mouse location.
        // doubleClick(WebElement element) - Double-clicks on an element.
        // contextClick(WebElement element) - Right-clicks on an element.
        // dragAndDrop(WebElement source, WebElement target) - Drags an element to a target location.

        // Example:
        Actions actions = new Actions(driver);
        WebElement menu = driver.findElement(By.id("menu-item"));
        actions.moveToElement(menu).perform(); // Hovers over the menu item


        // ==========================
        // 6. JavascriptExecutor Interface
        // ==========================
        // Allows executing JavaScript code for locating or interacting with elements.
        // Key method:
        // executeScript(String script, Object... args): Executes JavaScript in the browser.

        // Example:
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = (WebElement) js.executeScript("return document.getElementById('username');");
        element.sendKeys("test_user"); // Types "test_user" into the element


        // ==========================
        // Best Practices for Locators
        // ==========================
        // 1. Prefer using 'id' as it is unique and fast.
        // 2. Use 'cssSelector' for complex element identification.
        // 3. Use 'xpath' for deep or dynamic element structures.
        // 4. Avoid absolute XPath as it is fragile and prone to breaking.
        // 5. Validate locator stability and reliability across different environments.

Basics of Xpath:
 =========================
         XPath Notes

         1. **What is XPath?**
            - XPath (XML Path Language) is used to navigate and locate elements in XML or HTML documents.
            - It provides a way to select nodes or elements based on their attributes, text, or structure.
         2. **Types of XPath:**
            a. **Absolute XPath**:
               - Starts from the root of the document (`/`).
               - Example: `/html/body/div[1]/form/input`
               - **Disadvantage:** Fragile, as any structural change can break the path.
            b. **Relative XPath**:
               - Starts from anywhere in the document using `//`.
               - Example: `//input[@id='username']`
               - **Advantage:** More robust and flexible than absolute XPath.
         3. **Basic Syntax:**
            - `//tagname[@attribute='value']`
              * Selects a tag with a specific attribute and value.
              * Example: `//button[@type='submit']` selects a `<button>` with `type="submit"`.
            - `//tagname[text()='exact text']`
              * Selects a tag based on its exact visible text.
              * Example: `//h5[text()='Login Successful']`
         4. **Functions in XPath:**
            a. `contains()`:
               - Matches elements based on partial attribute or text values.
               - Syntax: `//tagname[contains(@attribute, 'partial_value')]`
               - Example: `//div[contains(@class, 'error')]` matches any `<div>` with a `class` containing "error".
            b. `starts-with()`:
               - Matches elements where an attribute starts with a specific value.
               - Syntax: `//tagname[starts-with(@attribute, 'start_value')]`
               - Example: `//input[starts-with(@name, 'user')]` matches `<input>` with `name` starting with "user".
            c. `ends-with()` (not natively supported in XPath 1.0):
               - For XPath 1.0, combine `contains()` and `substring()` for similar functionality.
               - Example: `//tagname[contains(@attribute, 'suffix')]` for approximate ends-with behavior.
         5. **Combining Conditions:**
            - Use `and` or `or` to combine multiple conditions.
            - Syntax: `//tagname[@attribute1='value1' and @attribute2='value2']`
            - Example: `//input[@type='text' and @name='username']` matches an `<input>` with both conditions.
         6. **Axes in XPath:**
            - Axes define the relationship between nodes in the XML/HTML tree.
            a. `parent::`
               - Selects the parent of the current node.
               - Example: `//input[@id='username']/parent::div` selects the parent `<div>` of an `<input>` element.
            b. `child::`
               - Selects direct child nodes.
               - Example: `//div/child::p` selects all `<p>` elements directly inside `<div>`.
            c. `ancestor::`
               - Selects all ancestors (parents, grandparents, etc.) of a node.
               - Example: `//span/ancestor::div` selects all `<div>` elements containing the `<span>`.
            d. `descendant::`
               - Selects all descendants (children, grandchildren, etc.) of a node.
               - Example: `//div/descendant::a` selects all `<a>` tags inside a `<div>`.
            e. `following-sibling::` and `preceding-sibling::`
               - Select siblings of a node in the DOM.
               - Example: `//h2/following-sibling::p` selects all `<p>` tags immediately after `<h2>`.
         7. **Positioning with XPath:**
            - Use `[position()]` or indexes to select elements based on their position in a list.
            - Syntax: `//tagname[index]`
            - Example: `//ul/li[1]` selects the first `<li>` inside a `<ul>`.
            - Last element: `//ul/li[last()]` selects the last `<li>` in a `<ul>`.
         8. **Wildcard Matching:**
            - `*` matches any tag.
              * Example: `//*[@id='username']` matches any element with `id='username'`.
            - `@*` matches any attribute.
              * Example: `//input[@*='value']` matches any `<input>` with an attribute having `value`.
         9. **Common Use Cases:**
            a. Locate elements by ID:
               `//input[@id='username']`
            b. Locate elements by class name:
               `//div[@class='error-message']`
            c. Locate elements by text:
               `//h1[text()='Welcome']`
            d. Locate elements with partial matching:
               `//a[contains(text(), 'Click here')]`
         10. **Best Practices:**
            - Use Relative XPath wherever possible for better robustness.
            - Avoid over-relying on text-based XPath as visible text can change frequently.
            - Test your XPath in browser dev tools to ensure correctness before using it in automation.
