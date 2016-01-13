#!/usr/bin/env python3
# -*- coding: utf-8 -*-
class Person(object):
    def __init__(self,name):
        self.__name = name # ˫�»��ߣ���ʾprivate����������ֹ���ʣ�����p.__name����
    @property
    def age(self):
        return self._age  # ���»��ߣ���ʾprotected��ԭ���ϲ�������ʣ�������p._name���Է��ʵ�
    @age.setter
    def age(self,value):
        if type(value) != int:
            raise ValueError('need a interger')
        if not (0< value <150):
            raise ValueError('need a reasonable number')
        self._age = value
         # ����д��self.age = value�ᱨ����Ϊ��������getter/setter��
         # �����Ե�ֱ�ӷ��ʻ���ø����Զ�Ӧ��getter/setter
         # ����д��self.age�൱���ֵ�����һ��age��getter���������ջᵼ�µݹ����ջ���

p = Person('xx')
p.age = 10 ; # ��������getter/setter�󣬶����Ե�ֱ�ӷ��ʻ���ø����Զ�Ӧ��getter/setter
print(hasattr(p,'age'))
print(hasattr(p,'_age')) # true
print(hasattr(p,'__name')) # false

# python����Ȩ�޻��Ʋ�����ֹ����,һ�нԿ��Ծ�
try:
    print(p.__name) # error û�и�����
    print(p.name) #error û�и�����
except ValueError as e:
    print(e)
finally:    
    print(p._Person__name) # ǿ�з���˽�б���
    print(p._age)  # �ܱ������ԣ�������ֱ�ӷ��ʣ�Ӧ��ʹ��getter��setter����
    print(p.age) #ok