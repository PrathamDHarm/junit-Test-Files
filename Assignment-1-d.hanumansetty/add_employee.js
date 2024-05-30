function addInfo() {
    // Get values from the input fields
    const name = document.getElementById('name').value;
    const dept = document.getElementById('dept').value;
    const role = document.getElementById('role').value;
    const email = document.getElementById('email').value;

    // Check if all fields are filled
    if (name === '' || dept === '' || role === '' || email === '') {
        alert('Please fill all fields');
        return;
    }

    // Reference to the table body
    const tableBody = document.querySelector('#employeeTable tbody');

    // Create a new row and cells
    const row = document.createElement('tr');

    // Insert cells with values
    row.innerHTML = `
        <td>${name}</td>
        <td>${dept}</td>
        <td>${role}</td>
        <td>${email}</td>
    `;

    // Append the new row to the table
    tableBody.appendChild(row);

    // Clear the form inputs
    document.getElementById('name').value = '';
    document.getElementById('dept').value = '';
    document.getElementById('role').value = '';
    document.getElementById('email').value = '';
}
