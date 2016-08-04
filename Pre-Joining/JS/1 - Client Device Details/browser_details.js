function detect_browser(){

	var browser_name = "";
	if((navigator.userAgent.indexOf("Opera") || navigator.userAgent.indexOf('OPR')) != -1 ) 
    {
        browser_name+=('Opera');
    }
    else if(navigator.userAgent.indexOf("Chrome") != -1 )
    {
        browser_name+=('Google Chrome');
    }
    else if(navigator.userAgent.indexOf("Safari") != -1)
    {
        browser_name+=('Safari');
    }
    else if(navigator.userAgent.indexOf("Firefox") != -1 ) 
    {
        browser_name+=('Mozilla Firefox');
    }
    else if((navigator.userAgent.indexOf("MSIE") != -1 ) || (!!document.documentMode == true )) //IF IE > 10
    {
      	browser_name+=('IE'); 
    }  
    else 
    {
    	browser_name+= navigator.appName;
    }
    return browser_name;
}

var browser_name = "<br>Browser Name: " + detect_browser();

var screen_resolution = "<br>Screen Resolution: " +  window.screen.availWidth + " x " + window.screen.availHeight;

var page_modified_details = "<br>Page Modified Date: " + document.lastModified;

document.write("1. Client Device Details: <br>" + browser_name + screen_resolution + page_modified_details);