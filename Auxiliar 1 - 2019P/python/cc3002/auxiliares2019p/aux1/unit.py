"""
This module contains the implementation of a unit from a generic game.
"""


def attack(enemy: 'Unit', damage: int):
    enemy.hit_points -= damage


class Unit:
    """
    Base class for the units
    """
    _hit_points: int
    _strength: int

    def __init__(self, hit_points: int, strength: int):
        self._hit_points = hit_points
        self._strength = strength

    @property
    def hit_points(self):
        return self._hit_points

    @hit_points.setter
    def hit_points(self, value):
        self._hit_points = value

    def attack(self, enemy: 'Unit'):
        pass
