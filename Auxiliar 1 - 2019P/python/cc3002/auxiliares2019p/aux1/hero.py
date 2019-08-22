"""
This module contains the implementation of a hero
"""
from cc3002.auxiliares2019p.aux1.unit import Unit, attack


class Hero(Unit):
    _name: str

    def __init__(self, name: str):
        super(Hero, self).__init__(16, 4)
        self._name = name

    @property
    def name(self):
        return self._name

    def attack(self, enemy: Unit):
        attack(enemy, self._strength)
