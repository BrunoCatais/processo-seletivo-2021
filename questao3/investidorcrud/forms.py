from django import forms
from .models import Investidor

class InvestidorForm(forms.ModelForm):
    class Meta:
        model = Investidor
        fields = ['nome', 'cpf', 'data_nasc', 'valor_invest']