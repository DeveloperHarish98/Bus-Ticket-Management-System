document.getElementById('ticketForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    const passengerName = document.getElementById('passengerName').value;
    const passengerEmail = document.getElementById('passengerEmail').value;
    const busNumber = document.getElementById('busNumber').value;

    const ticketData = {
        passengerName: passengerName,
        passengerEmail: passengerEmail,
        busNumber: busNumber
    };

    fetch('/api/tickets', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(ticketData)
    })
    .then(response => {
        if (response.ok) {
            alert('Ticket booked successfully!');
            loadTickets(); // Reload tickets after booking
        } else {
            alert('Failed to book ticket: ' + response.statusText);
        }
    })
    .catch(error => console.error('Error:', error));
});

// Function to load current tickets
function loadTickets() {
    fetch('/api/tickets')
    .then(response => response.json())
    .then(tickets => {
        const ticketList = document.getElementById('ticketList');
        ticketList.innerHTML = ''; // Clear existing tickets
        tickets.forEach(ticket => {
            const ticketItem = document.createElement('div');
            ticketItem.innerHTML = `<strong>${ticket.passengerName}</strong> - ${ticket.busNumber} (${ticket.passengerEmail})`;
            ticketList.appendChild(ticketItem);
        });
    })
    .catch(error => console.error('Error loading tickets:', error));
}

// User form handling
document.getElementById('userForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    const userName = document.getElementById('userName').value;
    const userEmail = document.getElementById('userEmail').value;

    const userData = {
        name: userName,
        email: userEmail
    };

    fetch('/api/users', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(userData)
    })
    .then(response => {
        if (response.ok) {
            alert('User added successfully!');
            loadUsers(); // Reload users after adding
        } else {
            alert('Failed to add user: ' + response.statusText);
        }
    })
    .catch(error => console.error('Error:', error));
});

// Function to load current users
function loadUsers() {
    fetch('/api/users')
    .then(response => response.json())
    .then(users => {
        const userList = document.getElementById('userList');
        userList.innerHTML = ''; // Clear existing users
        users.forEach(user => {
            const userItem = document.createElement('div');
            userItem.innerHTML = `<strong>${user.name}</strong> (${user.email})`;
            userList.appendChild(userItem);
        });
    })
    .catch(error => console.error('Error loading users:', error));
}

// Bus form handling
document.getElementById('busForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    const busNumber = document.getElementById('busNumber').value;
    const busRoute = document.getElementById('busRoute').value;

    const busData = {
        number: busNumber,
        route: busRoute
    };

    fetch('/api/buses', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(busData)
    })
    .then(response => {
        if (response.ok) {
            alert('Bus added successfully!');
            loadBuses(); // Reload buses after adding
        } else {
            alert('Failed to add bus: ' + response.statusText);
        }
    })
    .catch(error => console.error('Error:', error));
});

// Function to load current buses
function loadBuses() {
    fetch('/api/buses')
    .then(response => response.json())
    .then(buses => {
        const busList = document.getElementById('busList');
        busList.innerHTML = ''; // Clear existing buses
        buses.forEach(bus => {
            const busItem = document.createElement('div');
            busItem.innerHTML = `<strong>${bus.number}</strong> - ${bus.route}`;
            busList.appendChild(busItem);
        });
    })
    .catch(error => console.error('Error loading buses:', error));
}

// Load tickets, users, and buses on page load
loadTickets();
loadUsers();
loadBuses();