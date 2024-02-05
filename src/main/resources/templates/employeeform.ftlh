<!DOCTYPE html>  
<html lang="en">  
    <head>
        <meta charset="UTF-8">
        <title>Goldeneye</title>
    </head>
    <body>
        <h1>New Employees Form</h1>

        <form action="/api/v1/employee" method="POST"> 
        
            <label> Name:    <input type="text" name="name"> </label>
            </br></br>
            <label> Surname: <input type="text" name="surname"> </label>
            </br></br>

            <label for="office">Offices:</label>
            <select name="office" id="offices">
                <option value="milan">Milan</option>
                <option value="spain">Spain</option>
                <option value="newyork">New York</option>
            </select>

             </br></br>

            <label for="department">Departments:</label>
            <select name="department" id="departments">
                <option value="design">Design</option>
                <option value="business">Business</option>
                <option value="advertising">Advertising</option>
            </select>

        <button type="submit">Submit</button></form>
    </body>
</html>