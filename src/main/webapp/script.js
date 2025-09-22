document.addEventListener('DOMContentLoaded', function() {
    fetch('/api/invoice')
        .then(resp => resp.json())
        .then(data => {
            let html = '<ul>';
            //data.forEach(item => {
                html += `<li>${data.name} + ${data.price}</li>`;
            //});
            html += '</ul>';
            document.getElementById('invoice-container').innerHTML = html;
        })
        .catch(er => console.error("Failed to load invoice: "+ er));
});
