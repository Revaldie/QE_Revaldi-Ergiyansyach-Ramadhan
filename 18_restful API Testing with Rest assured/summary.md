# (18) RESTful API Testing with Rest Assured

## Resume
1. API Concept and Fundamental
2. Rest Assured Features 
3. Writing the Test

### API Concept and Fundamental
**Concept**
User >request> API >request> Application
User <<response<< API <<response<< Application

**Fundamental**
Mobile APP >> API Server >> Ext Process >> API Testing

Test Process
- Record, Define API information
- Parsing, Filter or Recording API Data And then Extract
- Reconstructuin API calls, and sent them from a simulate client
- Test Validation

### Rest Assured Features 
**Java Library for API Testing**
- Supports for HTTP Methods
- Support for BDD/Gherkin(Given, When, Then)
- Use of Hamcrest matches for checks(equalTo)
- User of Gapth for selecting element from JSON response

### Writing The Test

RestAssured >> .given() >> .when() >> .then()
			  Test Setup  Test Action Test Verification