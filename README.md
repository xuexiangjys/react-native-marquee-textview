# react-native-marquee-textview
MarqueeTextview for React Native

## 说明
only supports: react-native >= 0.42.0

platform:
android √

## 1、演示（请star支持）
![](https://github.com/xuexiangjys/react-native-marquee-textview/blob/master/example/img/demo.gif)

## 2、如何使用

### 2.1、增加项目依赖

#### 2.1.1、install from npm 

```
    npm i react-native-marquee-textview --save
```

#### 2.1.2、Link native library
```
    react-native link react-native-marquee-textview
```

### 2.2、项目中如何使用

```
    state = {
            items: []
        }
    
    componentDidMount() {
        MarqueeModule.getDisplayEntity('《赋得古原草送别》|离离原上草，一岁一枯荣。|野火烧不尽，春风吹又生。|远芳侵古道，晴翠接荒城。|又送王孙去，萋萋满别情。').then(values => {
            this.setState({
                items: values
            })
        })
    }

    render() {
        return (
            <View style={{flex: 1}}>
                <MarqueeTextView items={this.state.items} style={{width: '100%', height: '5%', backgroundColor: '#DDDDDD'}}/>
            </View>
        );
    }
```