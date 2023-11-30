#
# Copyright (c) 2017, Massachusetts Institute of Technology All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions are met:
#
# Redistributions of source code must retain the above copyright notice, this
# list of conditions and the following disclaimer.
#
# Redistributions in binary form must reproduce the above copyright notice, this
# list of conditions and the following disclaimer in the documentation and/or
# other materials provided with the distribution.
#
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
# AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
# IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
# DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
# FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
# DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
# SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
# CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
# OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
# OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
#

MC = __import__('MARTE2_COMPONENT', globals())


@MC.BUILDER('MathExpressionGAM', MC.MARTE2_COMPONENT.MODE_GAM)
class MARTE2_EXPR(MC.MARTE2_COMPONENT):
    inputs = [
        {'name': 'In1', 'type': 'int32', 'dimensions': 0, 'parameters': {}},
        {'name': 'In2', 'type': 'int32', 'dimensions': 0, 'parameters': {}},
        {'name': 'In3', 'type': 'int32', 'dimensions': 0, 'parameters': {}},
        {'name': 'In4', 'type': 'int32', 'dimensions': 0, 'parameters': {}},
        {'name': 'In5', 'type': 'int32', 'dimensions': 0, 'parameters': {}},
        {'name': 'In6', 'type': 'int32', 'dimensions': 0, 'parameters': {}},
        {'name': 'In7', 'type': 'int32', 'dimensions': 0, 'parameters': {}},
        {'name': 'In8', 'type': 'int32', 'dimensions': 0, 'parameters': {}},
    ]
    outputs = [
        {'name': 'Out1', 'type': 'int32', 'dimensions': 0, 'parameters': [
            {'name': 'Expression', 'type': 'string', 'value': '1'}]},
        {'name': 'Out2', 'type': 'int32', 'dimensions': -1, 'parameters': [
            {'name': 'Expression', 'type': 'string', 'value': '1'}]},
        {'name': 'Out3', 'type': 'int32', 'dimensions': -1, 'parameters': [
            {'name': 'Expression', 'type': 'string', 'value': '1'}]},
        {'name': 'Out4', 'type': 'int32', 'dimensions': -1, 'parameters': [
            {'name': 'Expression', 'type': 'string', 'value': '1'}]},
        {'name': 'Out5', 'type': 'int32', 'dimensions': -1, 'parameters': [
            {'name': 'Expression', 'type': 'string', 'value': '1'}]},
        {'name': 'Out6', 'type': 'int32', 'dimensions': -1, 'parameters': [
            {'name': 'Expression', 'type': 'string', 'value': '1'}]},
        {'name': 'Out7', 'type': 'int32', 'dimensions': -1, 'parameters': [
            {'name': 'Expression', 'type': 'string', 'value': '1'}]},
        {'name': 'Out8', 'type': 'int32', 'dimensions': -1, 'parameters': [
            {'name': 'Expression', 'type': 'string', 'value': '1'}]},
    ]
    parameters = [
        {'name': 'Parameter1', 'type': 'int32'},
        {'name': 'Parameter2', 'type': 'int32'},
        {'name': 'Parameter3', 'type': 'int32'},
        {'name': 'Parameter4', 'type': 'int32'},
        {'name': 'Parameter5', 'type': 'int32'},
        {'name': 'Parameter6', 'type': 'int32'},
        {'name': 'Parameter7', 'type': 'int32'},
        {'name': 'Parameter8', 'type': 'int32'},
    ]
    parts = []