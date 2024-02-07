<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Goldeneye</title>
</head>

<body onload="updateOffice()">
    <script type="text/javascript">
    function updateOffice() {
        const offices = {
            Milan: ['Design', 'Business', 'Advertising'],
            Spain: ['Research & development', 'Business'],
            "New York": ['Business', 'Advertising']
        };
        const officeSelect = document.getElementById('offices');
        const departmentSelect = document.getElementById('departments');
        officeSelect.addEventListener('change', () => {
            // Clear existing options
            departmentSelect.innerHTML = '';
            // Get selected office
            const selectedOffice = officeSelect.value;
            // Add options for selected office's departments
            offices[selectedOffice].forEach(department => {
                const option = document.createElement('option');
                option.value = department;
                option.text = department;
                departmentSelect.appendChild(option);
            });
        });
    }
    </script>
    <h1>New Employees Form</h1>
    <form action="/api/v1/employee" method="POST">
        <label> Name: <input type="text" name="name"> </label>
        </br></br>
        <label> Surname: <input type="text" name="surname"> </label>
        </br></br>
        <#-- <select id="offices" name="office" onchange="updateOffice()">
            <#list offices?keys as office>
                <option value=" ${office}">
                    ${office}
                </option>
            </#list>
            </select>
            <select id="departments" name="department">
                <#list offices[selectedOffice]
                    as department>
                    <option>
                        ${department}
                    </option>
                </#list>
            </select> -->
            <select id="offices" name="office">
                <option value="Milan">Milan</option>
                <option value="Spain">Spain</option>
                <option value="New York">New York</option>
            </select>
            <select id="departments" name="department"></select>
            <button type="submit">Submit</button>
    </form>
</body>

</html>