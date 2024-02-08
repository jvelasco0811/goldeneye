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
                Email Generator <span class="text-indigo-600">Form</span>
            </h3>
        </div>
        <form class="w-full">
            <div class="flex flex-wrap -mx-3 mb-6">
                <div class="w-full md:w-1/2 px-3 mb-6 md:mb-0">
                    <label class="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2" for="grid-first-name">
                        First Name
                    </label>
                    <input class="appearance-none block w-full bg-gray-200 text-gray-700 border border-red-500 rounded py-3 px-4 mb-3 leading-tight focus:outline-none focus:bg-white" id="grid-first-name" type="text" placeholder="First Name" name="name">
                    <p class="text-red-500 text-xs italic">Please fill out this field.</p>
                </div>
                <div class="w-full md:w-1/2 px-3">
                    <label class="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2" for="grid-last-name">
                        Surname
                    </label>
                    <input class="appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-200 rounded py-3 px-4 leading-tight focus:outline-none focus:bg-white focus:border-gray-500" id="grid-last-name" type="text" placeholder="Surname" name="surname">
                </div>
            </div>
            <div class="flex flex-wrap -mx-3 mb-6">
                <div class="w-full px-3">
                    <label class="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2" for="grid-password">
                        Office
                    </label>
                    <select id="offices" name="office" onchange=updateOffice() class="appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-200 rounded py-3 px-4 mb-3 leading-tight focus:outline-none focus:bg-white focus:border-gray-500">
                        <option value="Milan">Milan</option>
                        <option value="Spain">Spain</option>
                        <option value="New York">New York</option>
                    </select>
                    <#-- <input class="appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-200 rounded py-3 px-4 mb-3 leading-tight focus:outline-none focus:bg-white focus:border-gray-500" id="grid-email" type="email" placeholder="********@*****.**"> -->
                </div>
            </div>
            <div class="flex flex-wrap -mx-3 mb-6">
                <div class="w-full px-3">
                    <label class="block uppercase tracking-wide text-gray-700 text-xs font-bold mb-2" for="grid-password">
                        Deparment
                    </label>
                    <select id="departments" name="department" class="appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-200 rounded py-3 px-4 mb-3 leading-tight focus:outline-none focus:bg-white focus:border-gray-500">
                    </select>
                    <#-- <input class="appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-200 rounded py-3 px-4 mb-3 leading-tight focus:outline-none focus:bg-white focus:border-gray-500" id="grid-email" type="email" placeholder="********@*****.**"> -->
                </div>
            </div>
            <div class="flex flex-wrap -mx-3 mb-6">
                <div class="flex justify-between w-full px-3">
                    <button class="shadow bg-indigo-600 hover:bg-indigo-400 focus:shadow-outline focus:outline-none text-white font-bold py-2 px-6 rounded" type="submit">
                        Send Message
                    </button>
                </div>
            </div>
        </form>
    </div>
</body>

</html>