document.addEventListener('DOMContentLoaded', function() {
    fetch('/api/invoice')
        .then(resp => resp.json())
        .then(data => {
            let html = '<ul>';
            Object.entries(data).forEach(item => {
                html += `<li>${item[0]} - ${item[1]}</li>`;
            });
            html += '</ul>';
            document.getElementById('invoice-container').innerHTML = html;
        })
        .catch(er => console.error("Failed to load invoice: "+ er));
});
