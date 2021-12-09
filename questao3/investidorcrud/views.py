from django.shortcuts import redirect, render
from .models import Investidor
from .forms import InvestidorForm

def list_investidores(request):
    investidores = Investidor.objects.all()
    return render(request, 'investidores.html', {'investidores': investidores})

def create_investidor(request):
    form = InvestidorForm(request.POST or None)

    if form.is_valid():
        form.save()
        return redirect('list_investidores')

    return render(request, 'investidores-form.html', {'form': form})

def update_investidor(request, id):
    investidor = Investidor.objects.get(id=id)
    form = InvestidorForm(request.POST or None, instance=investidor)

    if form.is_valid():
        form.save()
        return redirect('list_investidores')
    
    return render(request, 'investidores-form.html', {'form': form, 'investidor':investidor})

def delete_investidor(request, id):
    investidor = Investidor.objects.get(id=id)

    if request.method == 'POST':
        investidor.delete()
        return redirect('list_investidores')
    
    return render(request, 'delete-confirm.html', {'investidor':investidor})