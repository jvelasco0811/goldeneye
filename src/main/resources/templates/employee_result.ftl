<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/1.7.3/tailwind.min.css">
    <title>Goldeneye</title>
</head>

<body onload="updateOffice()">
    <script type="text/javascript">
    function updateOffice() {
        let selectedOffice = document.getElementById("offices").value;
        if (!selectedOffice) {
            selectedOffice = "Milan";
        }
        const offices = {
            Milan: ['Design', 'Business', 'Advertising'],
            Spain: ['Research & development', 'Business'],
            "New York": ['Business', 'Advertising']
        };
        const officeSelect = document.getElementById('offices');
        const departmentSelect = document.getElementById('departments');
        // Clear existing options
        departmentSelect.innerHTML = '';
        // Get selected office
        selectedOffice = officeSelect.value;
        // Add options for selected office's departments
        offices[selectedOffice].forEach(department => {
            const option = document.createElement('option');
            option.value = department;
            option.text = department;
            departmentSelect.appendChild(option);
        });
    }
    </script>
    <style type="text/css">
    @import url("https://fonts.googleapis.com/css2?family=Poppins:wght@300,400;500,600;700&display=swap");

    body {
        font-family: "Poppins", sans-serif !important;
    }
    </style>
    <br><br>
    <br>
    <br>
    <div class="max-w-screen-md mx-auto p-5">
        <div class="text-center mb-16">
            <p class="mt-4 text-sm leading-7 text-gray-500 font-regular uppercase">
                goldeneye
            </p>
            <h3 class="text-3xl sm:text-4xl leading-normal font-extrabold tracking-tight text-gray-900">
                Employee Email <span class="text-indigo-600">
                    ${employee.email}
                </span>
            </h3>
        </div>
        <form class="w-full" action="/api/v1/employee/form">
            <div class="flex flex-wrap -mx-3 mb-6">
                <div class="w-full px-3">
                    <label class="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2" for="grid-first-name">
                        First Name: <span class="text-indigo-600">
                            ${employee.name}
                        </span>
                    </label>
                    <label class="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2" for="grid-first-name">
                        Surname: <span class="text-indigo-600">
                            ${employee.surname}
                        </span>
                    </label>
                    <label class="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2" for="grid-first-name">
                        Office: <span class="text-indigo-600">
                            ${employee.office}
                        </span>
                    </label>
                    <label class="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2" for="grid-first-name">
                        Department: <span class="text-indigo-600">
                            ${employee.department}
                        </span>
                    </label>
                </div>
            </div>
            <div class="flex flex-wrap -mx-3 mb-6">
                <div class="flex justify-between w-full px-3">
                    <button class="shadow bg-indigo-600 hover:bg-indigo-400 focus:shadow-outline focus:outline-none text-white font-bold py-2 px-6 rounded" type="submit">
                        Get Back
                    </button>
                </div>
            </div>
        </form>
    </div>
</body>

</html>