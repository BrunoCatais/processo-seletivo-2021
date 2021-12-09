from django.urls import path
from .views import delete_investidor, list_investidores, create_investidor, update_investidor, delete_investidor

urlpatterns = [
    path('', list_investidores, name='list_investidores'),
    path('new', create_investidor, name='create_investidor'),
    path('update/<int:id>/', update_investidor, name='update_investidor'),
    path('delete/<int:id>/', delete_investidor, name='delete_investidor')
]