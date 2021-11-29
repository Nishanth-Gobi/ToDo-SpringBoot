<html>
    <head>
        <title>Input Box</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="home.css">
        
    </head>
    <body>
        <!---------------Main Box-->
        <div class="container">
            <div class="todoBlock">
              <!-- main title holder -->
              <div class="titleHolder">
                <h1>To Do List</h1>
              </div>
              <!-- todo list -->
              <div class="todoList">
                <!-- list holder -->
                <div class="listHolder" id="listHolder">
                  <ul class="list" id="lists">

<!--  Template injection here  -->
                    
                  </ul>
                </div>
                <div class="formHolder">
                  <div class="col big">
                    <form action="addItem" method="">
						<br>
						<input type="text" name="item" placeholder="Things to be done..."><br>
						<br>
						<input type="text" name="deadline" placeholder="Deadline..."><br>
						<br>
						<input type="submit"><br>
						<span class="error">${error}</span>
					</form>                   
                  </div>
                  <br>
                  <form action="/logout">
                  	<input type="submit" value="Logout"/>
                  </form>
                </div>
              </div>
            </div>
          </div>
    </body>
</html>
