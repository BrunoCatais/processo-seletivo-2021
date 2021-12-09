from django.db import models

class Investidor(models.Model):
    nome = models.CharField(max_length=60)
    cpf = models.CharField(max_length=11)
    data_nasc = models.DateField()
    valor_invest = models.DecimalField(max_digits= 12, decimal_places= 2)

    def __str__(self):
        return self.nome
