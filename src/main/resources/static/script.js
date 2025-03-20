document.getElementById('ticketForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const passengerName = document.getElementById('passengerName').value;
    const passengerEmail = document.getElementById('passengerEmail').value;
    const busNumber = document.getElementById('busNumber').value;

    fetch('/api/tickets', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            passengerName,
            passengerEmail,
            busNumber
        })
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById('response').innerText = 'Ticket booked successfully!';
    })
    .catch(error => {
        document.getElementById('response').innerText = 'Error booking ticket!';
    });
});